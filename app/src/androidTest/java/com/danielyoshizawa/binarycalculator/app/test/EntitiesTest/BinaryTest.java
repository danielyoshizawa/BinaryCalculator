package com.danielyoshizawa.binarycalculator.app.test.EntitiesTest;

import com.danielyoshizawa.binarycalculator.app.Entities.Binary;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTest {

    Binary binary;

    @Before
    public void setUp() throws Exception {
        binary = new Binary();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addFiveNumbers() throws Exception {
        binary.AddDigit(1);
        binary.AddDigit(1);
        binary.AddDigit(0);
        binary.AddDigit(1);
        binary.AddDigit(0);

        ArrayList<Integer> binaryList = binary.GetBinaryList();

        assertEquals("First Digit is wrong", (int) binaryList.get(0), 1);
        assertEquals("Second Digit is wrong", (int) binaryList.get(1), 1);
        assertEquals("Third Digit is wrong", (int) binaryList.get(2), 0);
        assertEquals("Fourth Digit is wrong", (int) binaryList.get(3), 1);
        assertEquals("Fifth Digit is wrong", (int) binaryList.get(4), 0);
    }

    @Test
    public void binaryWithFiveDigitsToDecimal() throws Exception {
        binary.AddDigit(1);
        binary.AddDigit(1);
        binary.AddDigit(0);
        binary.AddDigit(1);
        binary.AddDigit(0);

        assertEquals("Decimal number is not correct", binary.GetDecimal(), 26);
    }

    @Test
    public void settingValueUsingString() throws Exception {
        String binaryString = "10101010";
        binary.SetValueFromString(binaryString);

        assertEquals("Value is diferent from input string", binary.GetString(), binaryString);
        assertEquals("Binary size is diferent from input string", binary.GetBinaryList().size(), binaryString.length());
    }

    @Test
    public void getDecimalString() throws Exception {
        binary.AddDigit(1);
        binary.AddDigit(1);
        binary.AddDigit(0);
        binary.AddDigit(1);
        binary.AddDigit(0);

        assertEquals("Decimal number ,in String Format,is not correct", binary.GetDecimalString(), "26");
    }
}