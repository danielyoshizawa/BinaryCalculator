package com.danielyoshizawa.binarycalculator.app.Display;

public class DisplayService extends DisplayEvents {

    String displayText = "";

    public DisplayService() {
        super();
    }

    public void AddNumber(int number) {
        displayText += Integer.toString(number);
        notifyEvents();
    }


    public String GetText() {
        return displayText;
    }
}
