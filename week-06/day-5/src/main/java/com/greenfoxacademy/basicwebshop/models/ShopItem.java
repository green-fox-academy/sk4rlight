package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {

    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;
    private String type;
    private String currency = "Ft";


    public ShopItem(String name, String description, Double price, Integer quantityOfStock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
    }

    public String getFormattedPrice() {
        return getPrice().toString() + " " + getCurrency();
    }

    public String getCurrency() {
        return currency;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }
}
