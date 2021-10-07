package com.company;

public class Motor {
    boolean onOff;

    public Motor(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
    /*
    public void motor(boolean tændt){
        if(tændt == true){
            System.out.println("Motoren er tændt");
        }
        else{
            System.out.println("Motoren er slukket");
        }
    }
   */
}
