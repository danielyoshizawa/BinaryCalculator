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

    // TODO : Implement the algorithm
    public String SumBinaries() {
        int result = 0;

        for (Binary b: operands) {
            result += Integer.parseInt(b.GetDecimalString());
            Log.i("SUM_BINARIES", b.GetDecimalString());
        }

        operands.clear();
        Log.i("SUM_BINARIES", Integer.toString(result));

        return Integer.toBinaryString(result);
    }

    public ArrayList<Binary> GetOperandsList() {
        return operands;
    }
}
