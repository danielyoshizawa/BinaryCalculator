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

        binaryToString();

        return displayText;
    }

    public void CleanDisplay() {
        displayText = "";
        //binaryNumber.Clear();
        binaryNumber = new Binary();
        notifyEvents();
    }

    public Binary GetBinaryNumber() {
        return new Binary(binaryNumber);
    }

    public void ShowBinaryValue(Binary binary) {
        binaryNumber = binary;
        binaryToString();
        notifyEvents();
    }

    private void binaryToString() {
        for (int number : binaryNumber.GetBinaryList()) {
            displayText += Integer.toString(number);
        }
    }
}
