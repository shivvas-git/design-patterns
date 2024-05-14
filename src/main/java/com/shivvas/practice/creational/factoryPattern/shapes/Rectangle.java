package com.shivvas.practice.creational.factoryPattern.shapes;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("rectangle")
public class Rectangle implements IShape {

    @Override
    public double calculateArea(List<Integer> sides) {
        System.out.println("Calculating rectangle area");
        return 0;
    }
}
