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
    }

    @After
    public void tearDown() throws Exception {
        operationsService = null;
    }

    @Test
    public void addBinary() throws Exception {
        Binary binary1 = new Binary();
        Binary binary2 = new Binary();
        Binary binary3 = new Binary();

        binary1.AddDigit(1);
        binary1.AddDigit(0);
        binary1.AddDigit(1);

        binary2.AddDigit(1);
        binary2.AddDigit(1);
        binary2.AddDigit(0);

        binary3.AddDigit(0);
        binary3.AddDigit(1);
        binary3.AddDigit(1);

        operationsService.AddBinary(binary1);
        operationsService.AddBinary(binary2);
        operationsService.AddBinary(binary3);

        ArrayList<Binary> operands = operationsService.GetOperandsList();

        assertEquals("Operand 1 =", operands.get(0).GetDecimal(), 5);
    }

    @Test
    public void sumBinaries() throws Exception {

    }

}