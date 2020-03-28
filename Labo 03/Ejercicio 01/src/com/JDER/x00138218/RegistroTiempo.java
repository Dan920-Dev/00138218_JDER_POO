package com.JDER.x00138218;

public class RegistroTiempo {
    private int hour;
    private int min;
    private String totalTime;

    public RegistroTiempo(int hour, int min) {
        this.hour = hour;
        this.min = min;
        this.totalTime = totalTime;

        if(hour < 10 &&  min < 10 ) {
            totalTime = "0" + hour + ":" + "0" + min;
        }else{
            if(hour > 10 && min < 10){
                totalTime = hour + ":" + "0" + min;
            }else{
                if(hour < 10 && min > 10){
                    totalTime = "0" + hour + ":" + min;
                }else{
                    totalTime = hour + ":" + min;
                }
            }

        }
    }

    public String getTotalTime() {
        return totalTime;
    }

    public int getconversionTominutes(){
        return (hour*60) + min;
    }

}
