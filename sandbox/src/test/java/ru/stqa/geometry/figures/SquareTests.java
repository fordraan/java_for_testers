package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
      //  Assertions.assertEquals(25, result);
        if (!(result == 25.0)){
            throw new AssertionError (String.format ("Expected %f actual % f", 25.0, result));
        }
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void canCalculateTriangleArea() {

        Assertions.assertEquals(6.49519052838329, new Triangle(7.0, 5.0, 3.0).area());

    }

    @Test
    void canCalculateTrianglePerimeter() {
        Assertions.assertEquals(15.0, new Triangle(7.0, 5.0, 3.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //ok

        }
    }


}
