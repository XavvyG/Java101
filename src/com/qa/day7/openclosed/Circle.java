package com.qa.day7.openclosed;

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void calcArea(){
        System.out.println(this.getRadius() * this.getRadius() * Math.PI);
    }


}