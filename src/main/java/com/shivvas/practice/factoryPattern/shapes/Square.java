package com.shivvas.practice.factoryPattern.shapes;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("square")
public class Square extends Rectangle {

    @Override
    public double calculateArea(List<Integer> sides) {
        System.out.println("Calculating square area");
        return 0;
    }
}
