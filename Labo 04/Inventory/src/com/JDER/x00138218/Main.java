package com.JDER.x00138218;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Item> PersonalItem = new ArrayList<>();
    static ArrayList<Item> CommonItems = new ArrayList<>();

    public static void main(String[] args) {

        boolean valid = true, validList = true,  valid3 = true;
        int option = 0, id; String type, searchType; byte opList;

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su opcion: \n" + mainMenu()));

            switch (option){
                case 1:
                    do {
                        type = JOptionPane.showInputDialog(null, "   Tipos  que puede agregar \n" +
                                " \n 1. Pocion. \n 2. Elixir. \n 3. Municion. \n 4. Arma. \n Digite su opcion:");
                        if(type.equalsIgnoreCase("pocion")  || type.equalsIgnoreCase("elixir")
                                || type.equalsIgnoreCase("municion") || type.equalsIgnoreCase("arma")){
                            valid = true;
                            PersonalItem.add(addItem(type));
                        }else{
                            valid = false;
                        }
                    }while (!valid);

                    break;
                case 2:
                    if (PersonalItem.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Aun no hay Items Disponibles para compartir");
                    }else{
                        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar"));
                        for (Item i: PersonalItem) {
                            if(id == i.getID()){
                                CommonItems.add(i);
                                JOptionPane.showMessageDialog(null, "El Item se a compartido Exitosamente");
                            }else{
                                JOptionPane.showMessageDialog(null, "El ID ingresado no se encuentra!");
                            }
                        }
                    }
                    break;
                case 3:

                    do {
                        opList = Byte.parseByte(JOptionPane.showInputDialog(null, "Listas Disponibles \n 1. PersonalItems " +
                                "\n 2. CommonItems \n Elija su opcion"));

                        if(opList < 1 && opList > 2){
                            validList = true;
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta!, Intente nuevamente");
                        }else{
                            validList = false;
                        }
                    }while(validList);

                    if (opList == 1){
                        if (PersonalItem.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Aun no hay Items Disponibles para mostrar");
                        }else{
                            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar"));
                            for (Item i: PersonalItem) {
                                if(id == i.getID()){
                                    JOptionPane.showMessageDialog(null, i.toString());
                                    valid3 = true;
                                }else{
                                    valid3 = false;
                                }
                            }
                        }
                    }

                    if (opList == 2){
                        if (CommonItems.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Aun no hay Items Disponibles para mostrar");
                        }else{
                            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar"));
                            for (Item i: CommonItems) {
                                if(id == i.getID()){
                                    JOptionPane.showMessageDialog(null, i.toString());
                                    valid3 = true;
                                }else{
                                    valid3 = false;

                                }
                            }
                        }
                    }

                    if(!valid3){
                        JOptionPane.showMessageDialog(null, "El ID ingresado no se encuentra!");
                    }
                    break;
                case 4:
                    do {
                        opList = Byte.parseByte(JOptionPane.showInputDialog(null, "Listas Disponibles \n 1. PersonalItems " +
                                "\n 2. CommonItems \n Elija su opcion"));
                        if(opList < 1 && opList > 2){
                            validList = true;
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta!, Intente nuevamente");
                        }else{
                            validList = false;
                        }
                    }while(validList);

                    if (opList == 1){
                        if (PersonalItem.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Aun no hay Items Disponibles para mostrar");
                        }else{
                            searchType = JOptionPane.showInputDialog(null, "Digite el tipo a buscar");
                            if(searchType.equalsIgnoreCase("elixir")){
                                PersonalItem.forEach(i -> {
                                    if(i instanceof Elixir){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Elixir que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("pocion")){
                                PersonalItem.forEach(i -> {
                                    if(i instanceof Potion){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Pocion que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("municion")){
                                PersonalItem.forEach(i -> {
                                    if(i instanceof Ammo){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Municion que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("arma")){
                                PersonalItem.forEach(i -> {
                                    if(i instanceof Weapon){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Arma que mostrar!");
                                    }
                                });
                            }
                        }
                    }

                    if (opList == 2){
                        if (CommonItems.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Aun no hay Items Disponibles para mostrar");
                        }else{
                            searchType = JOptionPane.showInputDialog(null, "Digite el ID a buscar");

                            if(searchType.equalsIgnoreCase("elixir")){
                                CommonItems.forEach(i -> {
                                    if(i instanceof Elixir){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Elixir que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("pocion")){
                                CommonItems.forEach(i -> {
                                    if(i instanceof Potion){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Pocion que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("municion")){
                                CommonItems.forEach(i -> {
                                    if(i instanceof Ammo){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Municion que mostrar!");
                                    }
                                });
                            }

                            if(searchType.equalsIgnoreCase("arma")){
                                CommonItems.forEach(i -> {
                                    if(i instanceof Weapon){
                                        JOptionPane.showMessageDialog(null, i.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No hay Item tipo Arma que mostrar!");
                                    }
                                });
                            }

                        }
                    }
                    break;
                case 5:
                    do {
                        opList = Byte.parseByte(JOptionPane.showInputDialog(null, "Listas Disponibles \n 1. PersonalItems " +
                                "\n 2. CommonItems \n Elija su opcion"));
                        if(opList < 1 && opList > 2){
                            validList = true;
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta!, Intente nuevamente");
                        }else{
                            validList = false;
                        }
                    }while(validList);

                    if (opList == 1){
                        if (PersonalItem.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay Item  disponible para eliminar");
                        }else{
                            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar"));
                            deleteID(id, 1);
                        }
                    }

                    if (opList == 2){
                        if (CommonItems.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay Item  disponible para eliminar");
                        }else{
                            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el ID a buscar"));
                            deleteID(id, 2);
                        }
                    }
                    break;
                case 6:
                    do {
                        opList = Byte.parseByte(JOptionPane.showInputDialog(null, "Listas Disponibles \n 1. PersonalItems " +
                                "\n 2. CommonItems \n Elija su opcion"));
                        if(opList < 1 && opList > 2){
                            validList = true;
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta!, Intente nuevamente");
                        }else{
                            validList = false;
                        }
                    }while(validList);

                    if (opList == 1){
                        if (PersonalItem.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay Item  disponible para eliminar");
                        }else{
                            searchType = JOptionPane.showInputDialog(null, "Digite el tipo a eliminar");
                            deleteType(searchType, 1);
                        }
                    }

                    if (opList == 2){
                        if (CommonItems.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay Item  disponible para eliminar");
                        }else{
                            searchType = JOptionPane.showInputDialog(null, "Digite el tipo a eliminar");
                            deleteType(searchType, 2);
                        }
                    }
                    break;
                case 7:
                    valid =  false;
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta!");
                    break;
            }

        }while(valid);
    }


    static String mainMenu() {
        return " 1. Agregar Item \n 2. Compartir Item. \n 3. Buscar Item por ID. \n 4. Buscar Item por Tipo. " +
                "\n 5. Borrar Item por ID. \n 6. Borrar Item por tipo. \n 7. Salir del pograma.";
    }

    static Item addItem(String type) {
        boolean valid = true, valid1 = true, equiped = true;
        String typeWeapon, typeHealth, name, description, level, wieldType;
        int weigth, reuseTime, amount, levelWeapon, time, remainingUses;
        double speed, damage;

        name = JOptionPane.showInputDialog(null, "Digite su nombre: ");
        weigth = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su peso: "));
        description = JOptionPane.showInputDialog(null,"Digite la descripcion: ");

        if (type.equalsIgnoreCase("pocion")){
            reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tiempo de reutilizacion: "));

            do{
                level = JOptionPane.showInputDialog(null, "                    Nivel\n Menor \n Normal \n Mayor\n Digite el nivel");
                if(level.equalsIgnoreCase("menor") || level.equalsIgnoreCase("normal") || level.equalsIgnoreCase("mayor")){
                    valid = true;
                }else{
                    valid = false;
                    JOptionPane.showMessageDialog(null, "ERROR, El nivel solo puede ser: Menor, Normal y Mayor." +
                            "\n Intente nuevamente");
                }
            }while (!valid);

            do{
                typeHealth = JOptionPane.showInputDialog(null, "                    Tipo de Pocion\n Mana \n Vida \n Digite el tipo");
                if(typeHealth.equalsIgnoreCase("mana") || typeHealth.equalsIgnoreCase("vida")){
                    valid1 = true;
                }else{
                    valid1 = false;
                    JOptionPane.showMessageDialog(null, "ERROR, El tipo solo puede ser: Mana y Vida." +
                            "\n Intente nuevamente");
                }
            }while (!valid1);

            amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de la pocion"));
            return  new Potion(name, weigth, description, reuseTime, level, typeHealth, amount);
        }

        if (type.equalsIgnoreCase("elixir")){
            reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tiempo de reutilizacion: "));

            do{
                level = JOptionPane.showInputDialog(null, "                    Nivel\n Menor \n Normal \n Mayor\n Digite el nivel");
                if(level.equalsIgnoreCase("menor") || level.equalsIgnoreCase("normal") || level.equalsIgnoreCase("mayor")){
                    valid = true;
                }else{
                    valid = false;
                    JOptionPane.showMessageDialog(null, "ERROR, El nivel solo puede ser: Menor, Normal y Mayor." +
                            "\n Intente nuevamente");
                }
            }while (!valid);

            do{
                typeHealth = JOptionPane.showInputDialog(null, "                    Tipo de Elixir\n Mana \n Vida \n Digite el tipo");
                if(typeHealth.equalsIgnoreCase("mana") || typeHealth.equalsIgnoreCase("vida")){
                    valid1 = true;
                }else{
                    valid1 = false;
                    JOptionPane.showMessageDialog(null, "ERROR, El tipo solo puede ser: Mana y Vida." +
                            "\n Intente nuevamente");
                }
            }while (!valid);
            amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de la pocion"));
            time = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tiempo"));

            return new Elixir(name, weigth, description, reuseTime, level, typeHealth, amount, time);
        }

        if (type.equalsIgnoreCase("municion")){
            int opEquip = 0;
            remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de usos"));
            do{
                opEquip = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea quipar? \n 1. Si \n 2. No\n Digite su opcion"));
                switch (opEquip){
                    case 1:
                        equiped = true;
                        valid1 = false;
                        break;
                    case 2:
                        equiped = false;
                        valid1 = false;
                        break;
                    default:
                        valid1 = true;
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta \n Intente nuevamente");
                }
            }while(valid1);
            return new Ammo(name, weigth, description, remainingUses, equiped);
        }else{
            remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de usos"));

            do {
                typeWeapon = JOptionPane.showInputDialog(null,"              Tipos de Arma Disponible\n " +
                        "Arco\n Espada\n Personal\n Orbe\n Daga");
                if (typeWeapon.equalsIgnoreCase("arco") || typeWeapon.equalsIgnoreCase("espada") || typeWeapon.equalsIgnoreCase("personal")
                        || typeWeapon.equalsIgnoreCase("orbe") || typeWeapon.equalsIgnoreCase("daga")){
                    valid1 = false;
                }else{
                    valid1 = true;
                    JOptionPane.showMessageDialog(null, "ERROR, el tipo ingresado no esta disponible, Intente nuevamente");
                }
            }while (valid1);

            speed = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la velocidad del arma"));
            damage = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el daño del arma"));

            do {
                wieldType = JOptionPane.showInputDialog(null, "Digite el tipo de empuñadura \n Una mano\n Dos manos");
                if (wieldType.equalsIgnoreCase("una mano") || wieldType.equalsIgnoreCase("dos manos")){
                    valid = false;
                }else{
                    valid = true;
                    JOptionPane.showMessageDialog(null, "ERROR, el tipo ingresado no esta disponible, Intente nuevamente");
                }
            }while (valid);

            levelWeapon = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nivel del arma"));
            return new Weapon(name, weigth, description, remainingUses, typeWeapon, speed, damage, wieldType, levelWeapon);

        }
    }

    static void deleteID(int id, int op) {
        boolean validDelete = true;

        if (op == 1) {
            for (Item i : PersonalItem) {
                if (i.getID() == id) {
                    validDelete = true;
                } else {
                    validDelete = false;
                }
            }
        }

        if (op == 2) {
            for (Item i : CommonItems) {
                if (i.getID() == id) {
                    validDelete = true;
                } else {
                    validDelete = false;
                }
            }
        }

        if (validDelete && op == 1) {
            PersonalItem.removeIf(i -> i.getID() == id);
        } else {
            if (validDelete && op == 2) {
                CommonItems.removeIf(i -> i.getID() == id);
            }else{
                JOptionPane.showMessageDialog(null, "El ID no a sido encontrado");
            }
        }

    }

    static void deleteType(String type, int op) {
        boolean validDelete = false;

        if (op == 1){
            if (type.equalsIgnoreCase("elixir")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Elixir) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Elixir");
                    }
                });
                PersonalItem.removeIf(i -> i instanceof Elixir);
                validDelete = true;
            }

            if (type.equalsIgnoreCase("pocion")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Potion) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Pocion");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Potion);
            }

            if (type.equalsIgnoreCase("municion")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Ammo) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Municion");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Ammo);
            }

            if (type.equalsIgnoreCase("arma")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Weapon) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Arma");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Weapon);
            }
        }

        if (op == 2){
            if (type.equalsIgnoreCase("elixir")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Elixir) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Elixir");
                    }
                });
                PersonalItem.removeIf(i -> i instanceof Elixir);
                validDelete = true;
            }

            if (type.equalsIgnoreCase("pocion")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Potion) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Pocion");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Potion);
            }

            if (type.equalsIgnoreCase("municion")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Ammo) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Municion");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Ammo);
            }

            if (type.equalsIgnoreCase("arma")) {
                PersonalItem.forEach(i -> {
                    if (i instanceof Weapon) {
                        JOptionPane.showMessageDialog(null, "Se han eliminado los item de tipo Arma");
                    }
                });
                validDelete = true;
                PersonalItem.removeIf(i -> i instanceof Weapon);
            }
        }

        if(validDelete){
            JOptionPane.showMessageDialog(null, "No se a encontrado de este tipo a eliminar");
        }


    }

}