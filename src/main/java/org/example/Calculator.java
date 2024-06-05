package org.example;

public class Calculator {
    public double addTwoValues(double firstInputValue, double secondInputValue){
        double result =firstInputValue+secondInputValue;
        return  result;
    }
    //Subtraction of two integer value

    public int subtractTwoIntegerValues(int firstInputValue, int secondInputValue){
        int result = firstInputValue-secondInputValue;
        return result ;
    }
    //Greater value
    public boolean isGreater(int firstInputValue, int secondInputValue){
        boolean result=firstInputValue > secondInputValue;
        return result;
    }
    // Floating point division method
    public float divisionOfTwoValues(float firstInputValue, float secondInputValue) {
        float result= firstInputValue/secondInputValue;
        return result;
    }
}
