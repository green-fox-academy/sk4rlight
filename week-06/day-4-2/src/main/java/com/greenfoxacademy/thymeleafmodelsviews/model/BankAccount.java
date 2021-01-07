package com.greenfoxacademy.thymeleafmodelsviews.model;

public class BankAccount {
    String name;
    Double balance;
    String animalType;
    String currency = "Zebra";
    Boolean isKing = false;

    public BankAccount(String name, Double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, Double balance, String animalType, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBalanceFormatted() {
        return String.format("%.2f", balance);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getIsKing() {
        return isKing;
    }
}
