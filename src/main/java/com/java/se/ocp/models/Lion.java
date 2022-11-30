package com.java.se.ocp.models;

import com.java.se.ocp.interfaces.Run;

public class Lion implements Run {
    @Override
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override
    public boolean isQuadruped() {
        return true;
    }

    @Override
    public double getMaxSpeed() {
        return 100;
    }
}
