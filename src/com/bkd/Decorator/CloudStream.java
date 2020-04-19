package com.bkd.Decorator;
// Decorator pattern - add additional behavior to an object.
//concrete object
public class CloudStream implements Stream {
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}
