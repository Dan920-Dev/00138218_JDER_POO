package com.JDER.x00138218;

public  class IdGenerator {
    private static int counter = 0;

    private IdGenerator() {}

    public static int newId() {
        return counter++; // nuevo id aumentado en 1
    }
}