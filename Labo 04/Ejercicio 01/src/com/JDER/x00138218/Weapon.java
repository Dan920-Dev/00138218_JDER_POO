package com.JDER.x00138218;

public class Weapon extends ReusableItem {
    private String type;
    private double speed, damage;
    private String weildType;
    private int level;

    public void upgrade() {

    }

    public Weapon(String name, int weigth, String description, int remainingUses, String type, double speed, double damage, String weildType, int level) {
        super(name, weigth, description, remainingUses);
        this.type = type;
        this.speed = speed;
        this.damage = damage;
        this.weildType = weildType;
        this.level = level;
    }

    @Override
    public String toString() {

        return "Arma \n" + "ID: " + ID +  ", Nombre: " + name + ", Descripcion: " + description + ", Peso:" + ", Tipo: " +
                type + ", Nivel: " + level + ", Velocidad: " + speed + ", Daño: " + damage + ", Tipo de arma: " + weildType +
                ", Usos restantes: " + remainingUses;

    }
}
