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

    public MainController(){
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        shopItemList.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        shopItemList.add(new ShopItem("T-Shirt", "Blue with a corgi on a bike", 300.0, 1));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/webshop")
    public String webShop(Model model){
        model.addAttribute("shopItemList", shopItemList);
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model){
        List<ShopItem> onlyAvailableList = shopItemList.stream()
                .filter(x -> x.getQuantityOfStock() != 0)
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", onlyAvailableList);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model){
        List<ShopItem> cheapestFirstList = shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", cheapestFirstList);
        return "index";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model){
        Optional<ShopItem> optionalMostExpensiveShopItem = shopItemList.stream()
                .filter(x -> x.getQuantityOfStock()>0)
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .findFirst();

        String mostExpensiveName;
        if (optionalMostExpensiveShopItem.isPresent()){
            mostExpensiveName = optionalMostExpensiveShopItem.get().getName();
        } else {
            mostExpensiveName = "None.";
        }

        model.addAttribute("mostExpensiveName", mostExpensiveName);
        return "/most-expensive";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model){
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
    public String averageStock(Model model){
        OptionalDouble optionalDouble = shopItemList.stream()
               .mapToInt(ShopItem::getQuantityOfStock)
               .average();

        Double averageStock;

        if (optionalDouble.isPresent()){
            averageStock = optionalDouble.getAsDouble();
        } else {
            averageStock = 0D;
        }

       model.addAttribute("averageStock", averageStock);
        return "average-stock";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam (required = false) String searchId){
        List<ShopItem> foundShopItemList = shopItemList.stream()
                .filter(x -> x.getName().contains(searchId) || x.getDescription().contains(searchId))
                .collect(Collectors.toList());
        model.addAttribute("shopItemList", foundShopItemList);
        return "index";
    }

    @GetMapping("/")
    public String noPath(){
        return "redirect:/webshop";
    }



}
