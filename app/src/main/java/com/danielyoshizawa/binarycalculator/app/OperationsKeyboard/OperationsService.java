package com.danielyoshizawa.binarycalculator.app.OperationsKeyboard;

import com.danielyoshizawa.binarycalculator.app.Entities.Binary;

import java.util.ArrayList;

public class OperationsService {

    ArrayList<Binary> operands = new ArrayList<Binary>();

    public OperationsService() {

    }

    public void AddBinary(Binary binary) {
        operands.add(binary);
    }

    public Binary SumBinaries() {
        Binary result = new Binary();

        for (Binary b: operands) {

        }

        return result;
    }
}
