package com.cc.java;

public class Triangle extends Shape{

    private double baseline;
    private double hight;

    

    public Triangle(double baseline, double hight) {
        this.baseline = baseline;
        this.hight = hight;
    }



    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (baseline * hight) / 2;
    }

    

}
