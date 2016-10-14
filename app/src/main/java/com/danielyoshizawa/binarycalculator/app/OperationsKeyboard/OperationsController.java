package com.danielyoshizawa.binarycalculator.app.OperationsKeyboard;


import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.danielyoshizawa.binarycalculator.app.Display.DisplayService;
import com.danielyoshizawa.binarycalculator.app.R;

public class OperationsController {

    Activity activity;
    DisplayService displayService;
    Button clearButton;


    public OperationsController(Activity activity, DisplayService displayService) {
        this.activity = activity;
        this.displayService = displayService;

        initializeComponents();
        configureListeners();
    }

    private void initializeComponents() {
        clearButton = (Button) activity.findViewById(R.id.cleanBinaryButton);
    }

    private void configureListeners() {
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayService.CleanDisplay();
            }
        });
    }
}
