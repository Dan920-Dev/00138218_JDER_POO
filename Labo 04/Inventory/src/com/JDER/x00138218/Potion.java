package com.JDER.x00138218;

public class Potion extends HealthItem {
    private int amount;

    public Potion(String name, int weigth, String description, int reuseTime, String level, String type, int amount) {
        super(name, weigth, description, reuseTime, level, type);
        this.amount = amount;
    }



    @Override
    void Drink() {
    }

    @Override
    public String toString() {
        return "Pocion \n" + "ID: " + ID + ", Nombre " + name + ", Descripcion: " + description +  ", Peso" + weigth +
                ", Tipo: " + type + ", Nivel: " + level  + ", tiempo de reutilización"
                + reuseTime + ", Cantidad disponible" + amount ;
    }
}