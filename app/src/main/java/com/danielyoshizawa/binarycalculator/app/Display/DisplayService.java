package com.danielyoshizawa.binarycalculator.app.Display;

import com.danielyoshizawa.binarycalculator.app.Entities.Binary;

public class DisplayService extends DisplayEvents {

    String displayText = "";
    Binary binaryNumber = new Binary();


    public DisplayService() {
        super();
    }

    public void AddBinaryNumber(int number) {
        binaryNumber.AddDigit(number);
        notifyEvents();
    }


    public String GetText() {
        displayText = "";

        for (int number : binaryNumber.GetBinaryList()) {
            displayText += Integer.toString(number);
        }

        return displayText;
    }

    public void CleanDisplay() {
        displayText = "";
        binaryNumber.Clear();
        notifyEvents();
    }

    public Binary GetBinaryNumber() {
        return binaryNumber;
    }
}
