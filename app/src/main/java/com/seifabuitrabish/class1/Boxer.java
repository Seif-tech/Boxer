package com.seifabuitrabish.class1;

public class Boxer extends Fighter {


    public Boxer(int numberOfGloves, int punchSpeed, int punchPower) {
        super(numberOfGloves, punchSpeed, punchPower);
    }

    public int getNumberOfGloves() {
        return getNumberOfGloves();
    }

    public void setNumberOfGloves(int numberOfGloves) {
        if (numberOfGloves == 0) {
            return;
        }
        setNumberOfGloves(numberOfGloves);
    }

   /* public Boxer(int numberOfGloves, int punchSpeed, int punchPower) {
        super(numberOfGloves,punchSpeed,punchPower);

        if (numberOfGloves == 0 || punchSpeed == 0 || punchPower == 0) {
            this.numberOfGloves = numberOfGloves;
            this.punchSpeed = punchSpeed;
            this.punchPower = punchPower;
        }*/


}