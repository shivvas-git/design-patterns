package com.shivvas.practice.creational.factoryPattern.shapes;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("circle")
public class Circle implements IShape {
    @Override
    public double calculateArea(List<Integer> radius) {
        System.out.println("Calculating circle area");
        return 0;
    }
}
