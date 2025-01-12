package org.oppIntroduct;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Área: %.3f, Perímetro: %.3f", getArea(), getPerimeter());
    }
}
