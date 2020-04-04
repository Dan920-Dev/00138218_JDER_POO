package com.JDER.x00138218;

public abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level, type;

    public HealthItem(String name, int weigth, String description, int reuseTime, String level, String type) {
        super(name, weigth, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }


    abstract void Drink();

}
