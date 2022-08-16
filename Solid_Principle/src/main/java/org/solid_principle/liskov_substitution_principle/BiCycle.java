package org.solid_principle.liskov_substitution_principle;

public class BiCycle implements Bike{

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no Engine");
    }

    @Override
    public void accelerate() {
        //do somethings
    }
}
