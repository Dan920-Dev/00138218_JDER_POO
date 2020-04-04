package com.JDER.x00138218;

abstract  class Item {
    protected int ID;
    protected String name;
    protected int weigth;
    protected String description;

    public Item() {
    }

    public Item(String name, int weigth, String description) {
        this.ID = IdGenerator.newId();
        this.name = name;
        this.weigth = weigth;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

}