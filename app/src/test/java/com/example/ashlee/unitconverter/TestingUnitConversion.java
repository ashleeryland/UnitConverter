package com.example.ashlee.unitconverter;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestingUnitConversion {
    @Test
    public void checkingEquation()  {

        //testing some of the questions for unit conversion

        int[] testNumbers = {1, 20, 120, 36};

        System.out.println("KMs and Miles:");
        for(int i=0; i< testNumbers.length; i++){
            double result = testNumbers[i] * 0.62;
            System.out.println("\t" + testNumbers[i] + " km = " + result + " miles");
            double result2 = result * 1.60934;
            System.out.println("\t" + result + " Miles = " + result2 + " km");
        }

        System.out.println("Metres and Yards:");
        for(int i=0; i< testNumbers.length; i++){
            double result = testNumbers[i] * 1.09361;
            System.out.println("\t" + testNumbers[i] + " m = " + result + " yards");
            double result2 = result * 0.9144;
            System.out.println("\t" + result + " yards = " + result2 + " m");
        }

        System.out.println("Centimetres and Feet");
        for(int i=0; i< testNumbers.length; i++){
            double result = testNumbers[i] * 0.0328084;
            System.out.println("\t" + testNumbers[i] + " cm = " + result + " feet");
            double result2 = result * 30.48;
            System.out.println("\t" + result + " feet = " + result2 + " cm");
        }

        System.out.println("Millimetres and Inches");
        for(int i=0; i< testNumbers.length; i++){
            double result = testNumbers[i] * 0.0393701;
            System.out.println("\t" + testNumbers[i] + " mm = " + result + " inches");
            double result2 = result * 25.4;
            System.out.println("\t" + result + " inches = " + result2 + " mm");
        }

    }
}