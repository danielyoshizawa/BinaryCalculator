package com.danielyoshizawa.binarycalculator.app.test.DisplayTest;

import com.danielyoshizawa.binarycalculator.app.Display.DisplayEventsListeners;

public class DisplayEventsListenerFake implements DisplayEventsListeners {

    boolean isNotificationReceived;

    public DisplayEventsListenerFake() {
        isNotificationReceived = false;
    }

    @Override
    public void eventListener() {
        isNotificationReceived = true;
    }

    public boolean IsNotificationReceived() {
        return isNotificationReceived;
    }
}
