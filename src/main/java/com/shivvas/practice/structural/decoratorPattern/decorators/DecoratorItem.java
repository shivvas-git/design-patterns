package com.shivvas.practice.structural.decoratorPattern.decorators;

import com.shivvas.practice.structural.decoratorPattern.coffee.Coffee;


public abstract class DecoratorItem extends Coffee {

    private final Coffee coffee;

    public DecoratorItem(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getPrice() {
        return coffee.getPrice();
    }
}
