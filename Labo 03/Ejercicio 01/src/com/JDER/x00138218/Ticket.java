package com.JDER.x00138218;

public class Ticket {
    private String plaque;
    private RegistroTiempo hourInput;
    private RegistroTiempo hourExit;

    public Ticket(String plaque, RegistroTiempo hourInput) {
        this.plaque = plaque;
        this.hourInput = hourInput;
    }

    public String getPlaque() {
        return plaque;
    }

    public RegistroTiempo getHourInput() {
        return hourInput;
    }

    public void setHourExit(RegistroTiempo hourExit) {
        this.hourExit = hourExit;
    }

    public int moneyToPay(){
        int timeInside = hourExit.getconversionTominutes() - hourInput.getconversionTominutes();

        if(timeInside < 30){
            return 0;
        }else if(timeInside > 29 && timeInside< 60){
            return 50;
        }else if(timeInside > 59 && timeInside < 120){
            return 100;
        }else{
            return 500;
        }

    }


    @Override
    public String toString() {
        return  "Placa: " + plaque + " ---- " + "Hora de entrada: " + hourInput.getTotalTime();
    }
}
