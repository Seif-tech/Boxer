package com.seifabuitrabish.class1;

public class Fighter {

    protected int numberOfGloves=5;
    protected int punchSpeed=100;
    protected int punchPower=200;

    public int getNumberOfGloves() {
        return numberOfGloves;
    }

    public void setNumberOfGloves(int numberOfGloves) {
        this.numberOfGloves = numberOfGloves;
    }

    public void setPunchSpeed(int punchSpeed) {
        this.punchSpeed = punchSpeed;
    }

    public void setPunchPower(int punchPower) {
        this.punchPower = punchPower;
    }

    public int getPunchSpeed() {
        return punchSpeed;
    }

    public int getPunchPower() {
        return punchPower;
    }

    public Fighter(int numberOfGloves, int punchSpeed, int punchPower) {
        this.numberOfGloves = numberOfGloves;
        this.punchSpeed = punchSpeed;
        this.punchPower = punchPower;
    }
}
