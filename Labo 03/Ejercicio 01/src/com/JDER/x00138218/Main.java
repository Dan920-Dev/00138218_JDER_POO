package com.JDER.x00138218;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Ticket> listTicket = new ArrayList<>();
    static double totalSales = 0;


    public static void main(String[] args) {
        boolean follow = true;
        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, mainMenu()));

            switch (option) {
                case 1:
                    enterCar();
                    break;
                case 2:
                    exitParking();
                    break;
                case 3:
                    if (listTicket.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista de tickets vacia...");
                    } else {
                        searchTicket();
                    }
                    break;
                case 4:
                    if (listTicket.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay tickets para mostrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "                    Tickets \n"
                                + printTickets());
                    }
                    break;
                case 5:
                    if (totalSales == 0) {
                        JOptionPane.showMessageDialog(null, "Aun no hay ganancias :( ");
                    } else {
                        JOptionPane.showMessageDialog(null, "         Ganancia Total: $" + totalSales / 100 + "0");
                    }
                    break;
                case 6:
                    follow = false;
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;
            }

        } while (follow);

    }

    static String mainMenu() {
        return "*\n1. Ingresar automovil al parqueo. \n2. Salir del parqueo \n3. Consultar ticket \n"
                + "4. Ver tickets no cancelados \n5. Ver Ticket Cancelados y Ganancia total \n6. Salir";
    }

    static void enterCar() {
        boolean valid1 = true, valid2 = true;

        String plaque = JOptionPane.showInputDialog(null, "Digite la placa del vehiculo: ");

        Automovil car = new Automovil(plaque);

        for (Ticket t : listTicket) {
            if (t.getPlaque().equals(plaque)) {
                JOptionPane.showMessageDialog(null, "Ya se encuentra un automvil registrado con esta placa \n INTENTE NUEVAMENTE");
                valid1 = false;
                return;
            } else {
                valid1 = true;
            }
        }

        int hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la hora que ingresa al parqueo \nTOME EN CUENTA QUE ES EN HORA MILITAR: "));
        int min = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los minutos: "));

        if (hour < 0 || hour > 24 || min < 0 || min > 59) {
            JOptionPane.showMessageDialog(null, "La hora digitada es incorrecta \n INTENTE NUEVAMENTE");
            valid2 = false;
            return;
        } else {
            valid2 = true;
        }

        RegistroTiempo input = new RegistroTiempo(hour, min);

        if (valid1 == true && valid2 == true) {
            listTicket.add(new Ticket(car.getPlaque(), input));
        }

    }

    static void exitParking() {
        boolean valid1 = true;

        String plaque = JOptionPane.showInputDialog(null, "Digite la placa del vehiculo que saldra del parqueo: ");

        for (Ticket t : listTicket) {
            if (t.getPlaque().equals(plaque)) {
                int hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la hora que que sale del parqueo \nTOME EN CUENTA QUE ES EN HORA MILITAR: "));
                int min = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los minutos: "));

                if (hour < 0 || hour > 24 || min < 0 || min > 59) {
                    JOptionPane.showMessageDialog(null, "La hora digitada es incorrecta \n INTENTE NUEVAMENTE");

                    return;
                }

                RegistroTiempo exit = new RegistroTiempo(hour, min);

                if (t.getHourInput().getconversionTominutes() >= exit.getconversionTominutes()) {
                    JOptionPane.showMessageDialog(null, "                                  Ticket Invalido!\n"
                            + "La hora de salida ingresada es menor o igual a la hora de entrada");
                }

                t.setHourExit(exit);
                payTicket(t.moneyToPay());
                totalSales = totalSales + t.moneyToPay();
                valid1 = true;

            } else {
                JOptionPane.showMessageDialog(null, "                           Ticket Invalido!\n" +
                        "La placa ingresada no se enuentra registrada  ");
            }

        }

        if (valid1) {
            listTicket.removeIf(t -> t.getPlaque().equals(plaque));
        }
    }

    static void payTicket(float currency) {
        float paying = 0;

        if (currency == 0) {
            JOptionPane.showMessageDialog(null, "Tu parqueo es gratis");
            return;
        }

        Moneda five = new Moneda("cinco centavos", 5);
        Moneda ten = new Moneda("10 centavos", 10);
        Moneda twentyfive = new Moneda("25 centavos", 25);
        Moneda onehundred = new Moneda("1 dolar", 100);

        String[] optionPay = {five.getNameM(), ten.getNameM(), twentyfive.getNameM(), onehundred.getNameM()};
        Moneda[] op = {five, ten, twentyfive, onehundred};

        while (currency > paying) {
            int curr = JOptionPane.showOptionDialog(null, "Insertaste: $" + (paying / 100), "Monto a pagar: $"
                    + (currency / 100) + "0", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionPay, optionPay[0]);

            paying = paying + op[curr].getValue();
        }

        JOptionPane.showMessageDialog(null, "Tu vuelto es: $" + (paying - currency) / 100);
    }

    static String printTickets() {

        StringBuilder t = new StringBuilder();
        for (Ticket s : listTicket) {
            t.append(s.toString()).append("\n");
        }

        return t.toString();
    }

    static void searchTicket() {
        String plaque = JOptionPane.showInputDialog(null, "Digite la placa del ticket que busca: ");
        StringBuilder t = new StringBuilder();
        for (Ticket s : listTicket) {
            t.append(s.toString()).append("\n");
            if (s.getPlaque().equals(plaque)) {
                JOptionPane.showMessageDialog(null, t.toString());
            } else {
                JOptionPane.showMessageDialog(null, "                           Ticket Invalido!\n" +
                        "La placa ingresada no se enuentra registrada  ");
            }

        }
    }
}











