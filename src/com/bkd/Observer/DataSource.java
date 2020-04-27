package com.bkd.Observer;

import java.util.ArrayList;
// Subject
public class DataSource extends Subject {
    private int value; // When value changes other objects will need to be notified


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        // iterate over observer methods and call update method
        notifyObservers(value);
    }

}
