package com.qa.day7.openclosed;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public void calcArea(){
        System.out.println(this.getLength() * this.getWidth());
    }

}