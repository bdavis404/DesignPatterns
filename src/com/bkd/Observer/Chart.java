package com.bkd.Observer;

public class Chart implements Observer {
    private int sourceValue;

    @Override
    public void update(int value) {
        System.out.println("Chart Updated: " + value);
    }
}
