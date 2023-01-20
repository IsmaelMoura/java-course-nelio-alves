package section_14.exercises.ex03.model.entities;

import section_14.exercises.ex03.model.enums.Color;

public class Circle extends Shape {
    public Double radius;

    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI  * Math.pow(radius, 2);
    }
}
