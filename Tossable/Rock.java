package com.app;

public class Rock implements Tossable{
    @Override
    public void toss() {
        System.out.println("Rock is tossing...");
    }
}
