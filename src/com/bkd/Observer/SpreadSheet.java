package com.bkd.Observer;

public class SpreadSheet implements Observer {
    private int sourceValue;

    @Override
    public void update(int value) {
        System.out.println("Spread Sheet Updated: " + value);
    }
}
