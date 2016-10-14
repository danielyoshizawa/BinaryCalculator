package com.danielyoshizawa.binarycalculator.app;

import android.app.Activity;
import android.os.Bundle;
import com.danielyoshizawa.binarycalculator.app.BinaryKeyboard.BinaryKeyboardController;
import com.danielyoshizawa.binarycalculator.app.Display.DisplayController;
import com.danielyoshizawa.binarycalculator.app.Display.DisplayService;
import com.danielyoshizawa.binarycalculator.app.OperationsKeyboard.OperationsController;

public class BinaryCalculator extends Activity {

    DisplayService displayService;
    BinaryKeyboardController binaryKeyboardController;
    DisplayController displayController;
    OperationsController operationsController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_calculator);

        displayService = new DisplayService();
        binaryKeyboardController = new BinaryKeyboardController(this, displayService);
        displayController = new DisplayController(this, displayService);
        operationsController = new OperationsController(this, displayService);
    }
}
