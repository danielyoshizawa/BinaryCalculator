package com.danielyoshizawa.binarycalculator.app.OperationsKeyboard;


import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.danielyoshizawa.binarycalculator.app.Display.DisplayService;
import com.danielyoshizawa.binarycalculator.app.Entities.Binary;
import com.danielyoshizawa.binarycalculator.app.R;

public class OperationsController {

    Activity activity;
    DisplayService displayService;
    OperationsService operationsService;
    Button clearButton;
    Button addBinaryButton;
    Button equalButton;
    Button minusBinaryButton;

    public OperationsController(Activity activity, DisplayService displayService, OperationsService operationsService) {
        this.activity = activity;
        this.displayService = displayService;
        this.operationsService = operationsService;

        initializeComponents();
        configureListeners();
    }

    private void initializeComponents() {
        clearButton = (Button) activity.findViewById(R.id.cleanBinaryButton);
        addBinaryButton = (Button) activity.findViewById(R.id.addBinaryButton);
        equalButton = (Button) activity.findViewById(R.id.equalButton);
        minusBinaryButton = (Button) activity.findViewById(R.id.minusBinaryButton);
    }

    // TODO : Think if is necessary one class per listener
    private void configureListeners() {
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayService.CleanDisplay();
            }
        });
        // TODO : Refactor this, it is pretty odd
        addBinaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationsService.AddBinary(displayService.GetBinaryNumber());
                displayService.CleanDisplay();
                Binary binary = new Binary(operationsService.SumBinaries());
                operationsService.CleanOperands();
                operationsService.AddBinary(binary);
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Binary binary = new Binary();

                operationsService.AddBinary(displayService.GetBinaryNumber());
                displayService.CleanDisplay();

                if (operationsService.isAdd)
                    binary.SetValueFromString(operationsService.SumBinaries());
                else
                    binary.SetValueFromString(operationsService.SubtractBinaries());

                operationsService.CleanOperands();

                displayService.ShowBinaryValue(binary);
            }
        });

        minusBinaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationsService.AddBinary(displayService.GetBinaryNumber());
                displayService.CleanDisplay();
                Binary binary = new Binary(operationsService.SubtractBinaries());
                operationsService.CleanOperands();
                operationsService.AddBinary(binary);

            }
        });

    }
}
