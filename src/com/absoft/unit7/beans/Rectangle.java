package com.absoft.unit7.beans;

public class Rectangle implements Shape {

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSqare() {
        return side1 * side2;
    }

    public double getPerimeter(){
        return 2*(side1+side2);
    }
}
