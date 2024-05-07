package com.shivvas.practice.factoryPattern.factories;

import com.shivvas.practice.factoryPattern.shapes.IShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ShapeFactory {

    @Autowired
    Map<String, IShape> shapeImpl;

    public IShape getShape(String shape) {
        return shapeImpl.getOrDefault(shape, null);
    }
}
