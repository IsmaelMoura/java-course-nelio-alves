package com.ismael.moura.section_14.exercises.ex03.model.entities;

import com.ismael.moura.section_14.exercises.ex03.model.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() { super(); }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
