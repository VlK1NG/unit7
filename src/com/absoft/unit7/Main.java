package com.absoft.unit7;

import com.absoft.unit7.beans.Circle;
import com.absoft.unit7.beans.Rectangle;
import com.absoft.unit7.beans.Shape;
import com.absoft.unit7.beans.Square;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<Circle> circleClass = Circle.class;
        System.out.println(circleClass.getName());
        System.out.println(circleClass.getSimpleName());

        var annotations = circleClass.getAnnotations();
        for(var annotation: annotations){
            System.out.println(annotation.annotationType());
        }

        System.out.println("================================");
        printPerimeter(new Square(10));
        printPerimeter(new Rectangle(10,11));
    }


    private static void printPerimeter(Shape shape){
        Class<? extends Shape> aClass = shape.getClass();
        var annotation = aClass.getAnnotation(Deprecated.class);
        var className = aClass.getSimpleName();

        if (annotation != null){
            System.out.println(className + " has been deprecated.");
        } else {
            System.out.println("Perimeter of " + className + " is " + shape.getPerimeter());
        }
    }
}