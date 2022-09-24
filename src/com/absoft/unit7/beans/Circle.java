package com.absoft.unit7.beans;


import com.absoft.unit7.annotations.MyAnnotation;

@MyAnnotation
public class Circle implements Shape{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSqare() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
}