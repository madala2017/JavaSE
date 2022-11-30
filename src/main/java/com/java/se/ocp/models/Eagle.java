package com.java.se.ocp.models;

import com.java.se.ocp.interfaces.Fly;

public class Eagle implements Fly {
    @Override
    public int getWingSpan()  {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
