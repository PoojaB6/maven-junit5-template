package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class CalculatorTest {
    @Test
    public void sumOfPositiveValues(){

        //precondition: creating instance of calculator class
        Calculator myCalculator = new Calculator();

        //call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoValues(2,5);

        assertEquals(7 , actualValue);

    }

}
