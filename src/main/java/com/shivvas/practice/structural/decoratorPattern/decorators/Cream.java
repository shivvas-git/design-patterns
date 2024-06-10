package com.shivvas.practice.structural.decoratorPattern.decorators;

import com.shivvas.practice.structural.decoratorPattern.coffee.Coffee;

public class Cream extends DecoratorItem {

    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 8;
    }
}
