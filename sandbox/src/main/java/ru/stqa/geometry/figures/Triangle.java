package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle (
    double a,
    double b,
    double c
)

{
    public Triangle {

        if (a < 0 || b < 0 || c < 0 ) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
        if ((a + b) < c || (a + c ) < b || (b + c) < a ){
            throw new IllegalArgumentException("Sum of any two sides of a triangle should be less than third side");
        }


    }




    public double area() {
        return sqrt (perimeter()/2 * (perimeter()/2 - this.a)  *  (perimeter() / 2 - this.b) *  (perimeter() / 2 - this.c) );
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
