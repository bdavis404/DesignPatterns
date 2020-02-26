package com.bkd.state;

public class Eraser implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Erase Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}
