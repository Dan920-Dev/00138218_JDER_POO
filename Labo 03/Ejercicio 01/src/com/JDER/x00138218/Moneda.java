package com.JDER.x00138218;

public class Moneda {
    private String nameM;
    private int value;

    public Moneda(String nameM, int value){
        this.nameM = nameM;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getNameM() {
        return nameM;
    }
}
