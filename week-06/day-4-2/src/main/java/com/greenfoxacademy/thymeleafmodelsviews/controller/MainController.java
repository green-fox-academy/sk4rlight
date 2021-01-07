package com.greenfoxacademy.thymeleafmodelsviews.controller;

import com.greenfoxacademy.thymeleafmodelsviews.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public MainController(){
        bankAccountList.add(new BankAccount("Simba", 2000D, "lion"));
        bankAccountList.add(new BankAccount("Nala", 3000D, "lion cub"));
        bankAccountList.add(new BankAccount("Scar", 4000D, "black-maned lion"));
        bankAccountList.add(new BankAccount("Mufasa", 5000D, "king lion", true));
        bankAccountList.add(new BankAccount("Zazu", 6000D, "red-billed hornbill"));
    }

    @RequestMapping(value="/show")
    public String show(Model model){
        model.addAttribute("bankaccountlist", bankAccountList);
    //    csak akkor kell ezeket átadni, ha nem iterálsz végig a listán, nem a listát adtad tovább
    //    ha továbbadod a listát és végigiterálsz rajta, akkor tudni fogja a mezőket a listában, és lehet HTMl-ben is hivatkozni rá
    //    model.addAttribute("bankaccount", bankAccount);
    //    model.addAttribute("name", bankAccount.getName());
    //    model.addAttribute("balance", bankAccount.getBalance());
    //    model.addAttribute("animaltype", bankAccount.getAnimalType());

        return "index";
    }

    @RequestMapping(value="text")
    public String showString(){
        return "text";
    }
}
