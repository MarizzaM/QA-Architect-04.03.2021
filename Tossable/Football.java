package com.app;

public class Football extends Ball{

    public void football (String brandName){
        Ball(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Soccer Ball is tossing...");
    }

    @Override
    public void bounce() {
        System.out.println("Soccer Ball is bouncing on 40%");
    }

}
