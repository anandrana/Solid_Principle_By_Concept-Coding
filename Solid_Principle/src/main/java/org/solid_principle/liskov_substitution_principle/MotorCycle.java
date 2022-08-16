package org.solid_principle.liskov_substitution_principle;

public class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine(){
        isEngineOn=true;
    }

    @Override
    public void accelerate() {
        speed=speed+10;
    }
}
