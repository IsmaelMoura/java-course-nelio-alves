package com.ismael.moura.section_14.exercises.ex03.model.entities;

import com.ismael.moura.section_14.exercises.ex03.model.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
