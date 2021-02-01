package com.hexa.junitandespressotesting;

public class Helper {

    //helper methods to demonstrate JUnit testing

    public static int addition(int x, int y){
        //add two numbers
        return x + y;
    }

    public static int subtraction(int x, int y){
        //subtract second number from first number
        return x - y;
    }

    public static float convertCelsiusToFahrenheit(float c){
        //convert given celsius value to fahrenheit
        return (c * (9f / 5) + 32);
    }
}
