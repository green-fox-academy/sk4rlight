package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class MainController {

    List<ShopItem> shopItemList = new ArrayList<>();

    public MainController() {
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5, "Clothes and Shoes"));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2, "Electronics"));
        shopItemList.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0, "Beverages and Snacks"));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100, "Beverages and Snacks"));
        shopItemList.add(new ShopItem("T-Shirt", "Blue with a corgi on a bike", 300.0, 1, "Clothes and shoes"));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/webshop")
    public String webShop(Model model) {
        model.addAttribute("shopItemList", shopItemList);
        return "index";
    }


    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        List<ShopItem> onlyAvailableList = shopItemList.stream()
                .filter(x -> x.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", onlyAvailableList);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        List<ShopItem> cheapestFirstList = shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", cheapestFirstList);
        return "index";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        Optional<ShopItem> optionalMostExpensiveShopItem = shopItemList.stream()
                .filter(x -> x.getQuantityOfStock() > 0)
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .findFirst();

        String mostExpensiveName;
        if (optionalMostExpensiveShopItem.isPresent()) {
            mostExpensiveName = optionalMostExpensiveShopItem.get().getName();
        } else {
            mostExpensiveName = "None.";
        }

        model.addAttribute("mostExpensiveName", mostExpensiveName);
        return "/most-expensive";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> containsNikeList = shopItemList.stream()
                .filter(x -> x.getDescription().contains("Nike"))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", containsNikeList);
        return "index";
    }

    //  @GetMapping("average-stock")
    //  public String averageStock (Model model)
    //      List<ShopItem> averageStockList = shopItemList.stream()
    //              .mapToInt(ShopItem::getQuantityOfStock)
    //              .sum()

    //  a reset gombot a sima webShop()-ra!

    @GetMapping("average-stock")
    public String averageStock(Model model) {
        OptionalDouble optionalDouble = shopItemList.stream()
                .mapToInt(ShopItem::getQuantityOfStock)
                .average();

        Double averageStock;

        if (optionalDouble.isPresent()) {
            averageStock = optionalDouble.getAsDouble();
        } else {
            averageStock = 0D;
        }

        model.addAttribute("averageStock", averageStock);
        return "average-stock";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam(required = false) String searchId) {
        List<ShopItem> foundShopItemList = shopItemList.stream()
                .filter(x -> x.getName().contains(searchId) || x.getDescription().contains(searchId))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", foundShopItemList);
        return "index";
    }

    private List<ShopItem> filter(String name){
        List<ShopItem> filteredByTypeList = shopItemList.stream()
                .filter(x -> x.getType().equals(name))
                .collect(Collectors.toList());
        return filteredByTypeList;
    }

    @GetMapping("/")
    public String noPath() {
        return "redirect:/webshop";
    }

    @GetMapping("/more-filters")
    public String moreFilters(Model model) {
        model.addAttribute("shopItemList", shopItemList);
        return "type-index";
    }

    @GetMapping("/filtered-by-type/{name}")
    public String filterByType(Model model, @PathVariable String name){
        List<ShopItem> filteredByTypeList = filter(name);

        model.addAttribute("shopItemList", filteredByTypeList);
        model.addAttribute("name", name);
        return "type-index";
    }

   // @GetMapping("/filtered-by-type/{type}")
   // public String filterByProductType (@PathVariable String )




}
