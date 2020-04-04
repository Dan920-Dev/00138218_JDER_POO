package com.JDER.x00138218;

public class Elixir extends HealthItem {
    private int amount;
    private int time;

    public Elixir(String name, int weigth, String description, int reuseTime, String level, String type, int amount, int time) {
        super(name, weigth, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    @Override
    void Drink() {
        this.time = 0;
    }

    @Override
    public String toString() {

        return "Elixir \n" +"ID: " + ID + ", Nombre" + name + '\'' + ", Peso" + weigth + ", Descripcion: '" + description +
                ",Tipo: " + type + ",Nivel: " + level + ",Tiempo de reutilizacion: " + reuseTime + ",Tiempo: " + time;
    }

}
