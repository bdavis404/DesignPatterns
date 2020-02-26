package com.bkd;

import com.bkd.state.*;

public class Main {

    public static void main(String[] args) {
        DirectionService service = new DirectionService();

        service.setTravelMode(new DrivingMode());
        service.getDirection();
        service.getEta();



    }

}
