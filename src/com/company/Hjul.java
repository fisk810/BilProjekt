package com.company;

public class Hjul {
    private double hTurnDeg;

    public Hjul(double hTurnDeg) {
        this.hTurnDeg = hTurnDeg;
    }

    public double gethTurnDeg() {
        return hTurnDeg;
    }

    public void sethTurnDeg(double hTurnDeg) {
        this.hTurnDeg = hTurnDeg;
    }
}
