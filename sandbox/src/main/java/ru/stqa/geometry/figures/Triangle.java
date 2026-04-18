package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle (
    double a,
    double b,
    double c
)

{
    public double area() {
        return sqrt (perimeter()/2 * (perimeter()/2 - this.a)  *  (perimeter() / 2 - this.b) *  (perimeter() / 2 - this.c) );
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
