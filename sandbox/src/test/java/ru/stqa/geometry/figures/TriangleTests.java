package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void cannotCreateTriangleWithNegativeASide() {
        try {
            new Triangle(-5.0, 3.0, 7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }

    @Test
    void cannotCreateTriangleWithNegativeBSide() {
        try {
            new Triangle(5.0, -3.0, 7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }

    @Test
    void cannotCreateTriangleWithNegativeCSide() {
        try {
            new Triangle(5.0, 3.0, -7.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }


    @Test
    void cannotCreateTriangleWithSumOfFirstAndSecondSidesLessThirdSide() {
        try {
            new Triangle(5.0, 3.0, 8.1);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }


    @Test
    void cannotCreateTriangleWithSumOfFirstAndThirdSidesLessSecondSide() {
        try {
            new Triangle(6.0, 10.1, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }

    @Test
    void cannotCreateTriangleWithSumOfSecondAndThirdSidesLessFirstSide() {
        try {
            new Triangle(12.1, 7.0, 5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok

        }
    }

}
