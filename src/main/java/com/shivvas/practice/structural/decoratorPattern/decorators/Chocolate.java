package com.shivvas.practice.structural.decoratorPattern.decorators;


import com.shivvas.practice.structural.decoratorPattern.coffee.Coffee;

public class Chocolate extends DecoratorItem {

    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}
