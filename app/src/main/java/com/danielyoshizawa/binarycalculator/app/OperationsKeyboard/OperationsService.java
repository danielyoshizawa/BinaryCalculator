package com.danielyoshizawa.binarycalculator.app.OperationsKeyboard;

import android.util.Log;
import com.danielyoshizawa.binarycalculator.app.Entities.Binary;

import java.util.ArrayList;

public class OperationsService {

    ArrayList<Binary> operands = new ArrayList<Binary>();

    public OperationsService() {

    }

    public void AddBinary(Binary binary) {
        operands.add(binary);
    }

    public String SumBinaries() {
        int result = 0;

        for (Binary b: operands) {
            result += Integer.parseInt(b.GetDecimalString());
        }

        operands.clear();

        return Integer.toBinaryString(result);
    }

    public ArrayList<Binary> GetOperandsList() {
        return operands;
    }
}
