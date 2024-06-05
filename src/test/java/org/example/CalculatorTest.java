package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class CalculatorTest {

    @BeforeEach
    public void setUp(){
    }

    @Test //Adding two Positive value
    public void sumOfPositiveValues(){

        //precondition: creating instance of calculator class
        Calculator myCalculator = new Calculator();

        //call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoValues(2,5);
        assertEquals(7 , actualValue);
    }
    @Test//Adding two negative values
    public void sumOfTwoNegativeValues(){
        Calculator myCalculator = new Calculator();
        double actualValue = myCalculator.addTwoValues(-1,-2);
        assertEquals(-3 ,actualValue);
    }

    @Test//subtraction two positive values
    public void subtractingTwoPositiveValue(){
            Calculator myCalculator=new Calculator();
            //call subtractTwoValue method from calculator and give values
            int actualValue = myCalculator.subtractTwoIntegerValues(5,2);
            assertEquals(3 ,actualValue);
    }
    @Test//subtracting two negative values
    public void subtractingTwoNegativeValue(){
        Calculator myCalculator=new Calculator();
        int actualValue=myCalculator.subtractTwoIntegerValues(-5,-2);
        assertNotEquals(-7,actualValue);
    }

    @Test //Greater test
    public void firstValueIsGreater() {
        Calculator myCalculator=new Calculator();
        boolean actualValue = myCalculator.isGreater(10,9);
        assertTrue(actualValue);
    }

    @Test //second value is greater
    public void secondValueIsGreater(){
        Calculator myCalculator = new Calculator();
        boolean actualValue =myCalculator.isGreater(9,10);
        assertFalse(actualValue);

    }
    @Test//First value is equal value
    public void firstValueIsEqualToSecondValuesA(){
        Calculator myCalculator = new Calculator();
        boolean actualValue=myCalculator.isGreater(7,7);
        assertFalse(actualValue);

    }
    @Test //First value divided by second value
    public void divisionOfTwoValues(){
        Calculator myCalculator = new Calculator();
        Float actualValue =myCalculator.divisionOfTwoValues(5.1f,4.1f);
       assertEquals(1.2439024f,actualValue);
    }
    @Test//First value multiplied by second value
    public void multiplicationOfTwoValues() {
        Calculator myCalculator = new Calculator();
        Float actualValue = myCalculator.multiplicationOfTwoValues(5.1f, 4.1f);
        assertEquals(20.91f, actualValue);
    }
    @Test//Squaring a number
    public void squaringOfOneValue(){
        Calculator myCalculator = new Calculator();
        double valueInput=Math.sqrt(3);
    }
}
