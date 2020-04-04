package com.JDER.x00138218;

abstract class ReusableItem extends Item {
    protected int remainingUses;

    public void reduceUse() {

    }

    public ReusableItem(String name, int weigth, String description, int remainingUses) {
        super(name, weigth, description);
        this.remainingUses = remainingUses;
    }

    public boolean Use() {
        return true;
    }
}