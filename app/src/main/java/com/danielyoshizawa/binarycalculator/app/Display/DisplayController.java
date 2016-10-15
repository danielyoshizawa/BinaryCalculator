package com.danielyoshizawa.binarycalculator.app.Display;

import android.app.Activity;
import android.widget.TextView;
import com.danielyoshizawa.binarycalculator.app.R;

public class DisplayController implements DisplayEventsListeners{

    TextView displayTextView;
    DisplayService displayService;

    public DisplayController(Activity activity, DisplayService displayService) {

        this.displayService = displayService;
        displayTextView = (TextView) activity.findViewById(R.id.displayTextView);

        displayService.addListener(this);

    }

    @Override
    public void eventListener() {
        displayTextView.setText(displayService.GetText());
    }
}
