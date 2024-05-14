package com.shivvas.practice.creational.factoryPattern;


import com.shivvas.practice.creational.factoryPattern.factories.ShapeFactory;
import com.shivvas.practice.creational.factoryPattern.shapes.IShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.shivvas.practice.factoryPattern")
public class Application implements ApplicationRunner  {

    @Autowired
    ShapeFactory shapeFactory;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        IShape circle = shapeFactory.getShape("circle");
        circle.calculateArea(List.of(10));

        IShape rect = shapeFactory.getShape("rectangle");
        rect.calculateArea(List.of(10,20));

        IShape square = shapeFactory.getShape("square");
        square.calculateArea(List.of(10));
    }
}
