package com.danielyoshizawa.binarycalculator.app.test.DisplayTest;

import com.danielyoshizawa.binarycalculator.app.Display.DisplayEvents;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayEventsTest {

    DisplayEvents displayEvents;
    DisplayEventsListenerFake displayEventsListenerFake;

    @Before
    public void setUp() throws Exception {
        displayEvents = new DisplayEvents();
        displayEventsListenerFake = new DisplayEventsListenerFake();
    }

    @After
    public void tearDown() throws Exception {
        displayEvents = null;
    }

    @Test
    public void notificationReceived() throws Exception {
        displayEvents.addListener(displayEventsListenerFake);

        displayEvents.notifyEvents();

        assertTrue("Notification was not received", displayEventsListenerFake.IsNotificationReceived());
    }

}