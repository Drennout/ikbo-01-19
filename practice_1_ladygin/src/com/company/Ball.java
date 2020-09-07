package com.company;

public class Ball {
    private int size;
    private String collor;

    Ball (int size, String collor){
        this.size = size;
        this.collor = collor;
    }

    public String getCollor(){
        return collor;
    }

    public int getSize(){
        return size;
    }
}
