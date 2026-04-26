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

    @Test
    void testEquality(){
        var r1 = new Triangle (3.0, 4.0,5.0);
        var r2 = new  Triangle (3.0, 4.0, 5.0);
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void testEquality2(){
        var r2 = new  Triangle (3.0, 5.0, 4.0);
        var r3 = new  Triangle (4.0, 3.0, 5.0);
        Assertions.assertEquals(r2, r3);
    }
    @Test
    void testEquality3(){
        var r3 = new  Triangle (4.0, 3.0, 5.0);
        var r4 = new  Triangle (4.0, 5.0, 3.0);
         Assertions.assertEquals(r3, r4);
    }
    @Test
    void testEquality4(){
        var r4 = new  Triangle (4.0, 5.0, 3.0);
        var r5 = new  Triangle (5.0, 3.0, 4.0);
         Assertions.assertEquals(r4, r5);
    }
    @Test
    void testEquality5(){
        var r5 = new  Triangle (5.0, 3.0, 4.0);
        var r6 = new  Triangle (5.0, 4.0, 3.0);
        Assertions.assertEquals(r5, r6);
    }
    @Test
    void testEquality6(){
        var r6 = new  Triangle (5.0, 4.0, 3.0);
        var r1 = new Triangle (3.0, 4.0,5.0);
        Assertions.assertEquals(r6, r1);
    }






}
