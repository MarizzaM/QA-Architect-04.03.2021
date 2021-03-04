package com.app;

public class Spiderman extends Humanoid implements IClimb{

    protected long web_length;

    public Spiderman(String m_name, long web_length) {
        super(m_name);
        this.web_length = web_length;
    }

    @Override
    public void activeSpecialPower() {

    }

    @Override
    public void Climb() {

    }
}
