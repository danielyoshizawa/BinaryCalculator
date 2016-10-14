package com.danielyoshizawa.binarycalculator.app.Display;

import java.util.ArrayList;

// TODO : Find a better way, more generic
public class DisplayEvents {

    ArrayList<DisplayEventsListeners> listenersList = new ArrayList<DisplayEventsListeners>();

    public DisplayEvents() {

    }

    public void addListener(DisplayEventsListeners event) {
        listenersList.add(event);
    }

    public void notifyEvents() {
        for (DisplayEventsListeners events : listenersList) {
            events.eventListener();
        }
    }
}
