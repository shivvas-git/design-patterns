package com.shivvas.practice.structural.decoratorPattern;

import com.shivvas.practice.structural.decoratorPattern.coffee.Coffee;
import com.shivvas.practice.structural.decoratorPattern.coffee.Latte;
import com.shivvas.practice.structural.decoratorPattern.decorators.Chocolate;
import com.shivvas.practice.structural.decoratorPattern.decorators.Cream;

public class DriverClass {

    public void startMakingCoffee() {
        //Espresso -> 40
        //Mocha -> 25
        //Latte -> 30
        //chocolate -> 10
        //cream -> 8
        Coffee coffee = new Chocolate(new Cream(new Latte()));
        System.out.println("Coffee price is: " + coffee.getPrice());
    }
}
