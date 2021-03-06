package com.app;

public class Ball implements Tossable {

    private String m_brandName;

    public void Ball (String brandName){
        m_brandName = brandName;
    }

    public String getM_brandName(){
        return m_brandName;
    }

    public void bounce(){
        System.out.println("Ball is bouncing...");
    }

    @Override
    public void toss() {
        System.out.println("Ball is tossing...");
    }
}
