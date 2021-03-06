package com.app;

public class BaseBall extends Ball {

    public void baseball(String brandName){
        Ball(brandName);
    }

    @Override
    public void toss() {
        System.out.println("BaseBall is tossing...");
    }

    @Override
    public void bounce() {
        System.out.println("BaseBall is bouncing on 32%");
    }
}
