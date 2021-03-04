package com.app;

public class Superman extends Humanoid implements IFireLaser{

    protected long flight_speed;

    public Superman(String m_name, long flight_speed) {
        super(m_name);
        this.flight_speed = flight_speed;
    }

    @Override
    public void FireLaser() {

    }

    @Override
    public void activeSpecialPower() {

    }
}
