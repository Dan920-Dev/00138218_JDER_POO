package com.JDER.x00138218;

public class Ammo extends ReusableItem {
    private boolean equipped;

    public void equip() {

    }

    public Ammo(String name, int weigth, String description, int remainingUses, boolean equipped) {
        super(name, weigth, description, remainingUses);
        this.equipped = equipped;
    }

    @Override
    public String toString() {

        return "Municion \n" + "ID: " + ID + ", Nombre: " + name + ", Descripcion: " + description + ", Peso: " + weigth +
                ",Usos restantes: " + remainingUses + ", Equipado: " + equipped ;

    }
}
