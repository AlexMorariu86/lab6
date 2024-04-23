package org.example;

import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    void add() {
        Calculator calculator=new Calculator(10);
        calculator.add(5);
        assertEquals(15,calculator.getResult());
    }

    @Test
    public void multiply() {
        Calculator calculator=new Calculator(10);
        calculator.multiply(5);
        assertEquals(5,calculator.getResult());
    }

    @Test
    public void divide() {
        Calculator calculator=new Calculator(10);
        calculator.divide(5);
        assertEquals(2,calculator.getResult());
    }
}