package com.danielyoshizawa.binarycalculator.app.Display;

import android.app.Activity;
import android.widget.TextView;
import com.danielyoshizawa.binarycalculator.app.R;

public class DisplayController implements DisplayEventsListeners{


    TextView displayTextView;
    DisplayService displayService;

    public DisplayController(Activity activity, DisplayService displayService) {

        displayTextView = (TextView) activity.findViewById(R.id.displayTextView);
        displayTextView.setText("Controller");

        this.displayService = displayService;

        displayService.addListener(this);

    }

    @Override
    public void eventListener() {
        displayTextView.setText(displayService.GetText());
    }
}
