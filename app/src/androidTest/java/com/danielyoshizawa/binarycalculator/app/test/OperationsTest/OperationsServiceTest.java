package com.danielyoshizawa.binarycalculator.app.test.OperationsTest;

import com.danielyoshizawa.binarycalculator.app.Entities.Binary;
import com.danielyoshizawa.binarycalculator.app.OperationsKeyboard.OperationsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OperationsServiceTest {
    OperationsService operationsService;

    @Before
    public void setUp() throws Exception {
        operationsService = new OperationsService();
        Binary binary1 = new Binary();
        Binary binary2 = new Binary();

        binary1.AddDigit(1);
        binary1.AddDigit(0);
        binary1.AddDigit(1);

        binary2.AddDigit(1);
        binary2.AddDigit(1);
        binary2.AddDigit(0);

        operationsService.AddBinary(binary1);
        operationsService.AddBinary(binary2);
    }

    @After
    public void tearDown() throws Exception {
        operationsService = null;
    }

    @Test
    public void addBinary() throws Exception {

        Binary binary3 = new Binary();

        binary3.AddDigit(0);
        binary3.AddDigit(1);
        binary3.AddDigit(1);

        operationsService.AddBinary(binary3);

        ArrayList<Binary> operands = operationsService.GetOperandsList();

        assertEquals("Operand 1 !=", operands.get(2).GetDecimal(), 3);
    }

    @Test
    public void sumThreeBinaries() throws Exception {

        Binary binary3 = new Binary();

        binary3.AddDigit(0);
        binary3.AddDigit(1);
        binary3.AddDigit(1);

        operationsService.AddBinary(binary3);

        String result = operationsService.SumBinaries();

        assertEquals("Sum is wrong", result, "1110");
    }

    @Test
    public void sumTwoBinaries() throws Exception {
        String result = operationsService.SumBinaries();

        assertEquals("Sum is wrong", result, "1011");
    }

    public void minusTwoBinaries() throws Exception {
        operationsService.RemoveBinaryAt(1);

        Binary binary = new Binary("11");

        operationsService.AddBinary(binary);

        String result = operationsService.SubtractBinaries();

        assertEquals("101 - 11 is not 10", result, "10");
    }

}