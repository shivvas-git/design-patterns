package com.shivvas.practice.behavioral.statePattern;

public class Product {
    String name;
    Integer id;
    Integer price;
    Integer rowId;
    Integer colId;

    public Product(String name, Integer id, Integer price, Integer rowId, Integer colId) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.rowId = rowId;
        this.colId = colId;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getRowId() {
        return rowId;
    }

    public Integer getColId() {
        return colId;
    }
}
