package com.danielyoshizawa.binarycalculator.app.BinaryKeyboard;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.danielyoshizawa.binarycalculator.app.Display.DisplayService;
import com.danielyoshizawa.binarycalculator.app.R;

public class BinaryKeyboardController {

    Button binaryButton0;
    Button binaryButton1;
    DisplayService displayService;
    Activity activity;

    public BinaryKeyboardController(Activity activity, DisplayService displayService) {
        this.displayService = displayService;
        this.activity = activity;

        initializeComponents();
        configureListeners();
    }

    private void initializeComponents() {
        binaryButton0 = (Button) activity.findViewById(R.id.binaryButton0);
        binaryButton1 = (Button) activity.findViewById(R.id.binaryButton1);
    }

    private void configureListeners() {
        binaryButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayService.AddBinaryNumber(0);
            }
        });

        binaryButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayService.AddBinaryNumber(1);
            }
        });
    }


}
