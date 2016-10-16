package com.danielyoshizawa.binarycalculator.app.OperationsKeyboard;

import android.util.Log;
import com.danielyoshizawa.binarycalculator.app.Entities.Binary;

import java.util.ArrayList;

public class OperationsService {

    ArrayList<Binary> operands = new ArrayList<Binary>();
    // TODO : Create a Enum or a better approach
    // Just validating for now
    public boolean isAdd = false;

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

        isAdd = true;

        return Integer.toBinaryString(result);
    }

    public ArrayList<Binary> GetOperandsList() {
        return operands;
    }

    public void RemoveBinaryAt(int index) {
        operands.remove(index);
    }

    public String SubtractBinaries() {
        int result = 0;

        if (operands.size() >= 1) {
            result = Integer.parseInt(operands.get(0).GetDecimalString());

            for (int i = 1; i < operands.size(); i++) {
                result -= Integer.parseInt(operands.get(i).GetDecimalString());
            }
        }

        isAdd = false;

        return Integer.toBinaryString(result);
    }

    public void CleanOperands() {
        operands.clear();
    }
}
