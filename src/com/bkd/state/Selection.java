package com.bkd.state;

// concreteState
public class Selection implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");

    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");

    }
}
