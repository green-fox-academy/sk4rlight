package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {

    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;

    public ShopItem(String name, String description, Double price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
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
    }}
