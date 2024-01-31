package com.cc.java;

public class Circle extends Shape{

    private double radius;
    

    @Override
    public double area() {
        // TODO Auto-generated method stub
        // return radius * radius * Math.PI;
        return Math.PI * Math.pow(radius, radius);
    }

    

}
