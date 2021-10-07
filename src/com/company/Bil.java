package com.company;

public class Bil {
    private String biltype;
    private String model;
    private String stelnummer;
    private int antalDøre;
    private String softwareV;
    private double gpsX;
    private double gpsY;
    private double hastighed;


    Rat rat = new Rat(0);
    Bremse bremse = new Bremse();
    Motor motor = new Motor(false);
    Hjul hjul = new Hjul(0);

    public void turnRat(double input){
        if(input > 90 || input < -90){
            System.out.println("The car can not turn that far");
        }
        else if(input == 0){
            rat.setTurnDeg(input);
            hjul.sethTurnDeg(input);
            System.out.println("the car is now driving straight");
        }
        else {
            rat.setTurnDeg(input);
            hjul.sethTurnDeg(input);
            System.out.println("the car is turning by " + input + " degrees.");
        }
    }

    public void turnOn(Boolean on) {
        if (on == true) {
            motor.setOnOff(true);
            System.out.println("motoren er tændt");
        } else if (on == false) {
            motor.setOnOff(false);
            System.out.println("motoren er slukket");
        } else {
            motor.setOnOff(motor.isOnOff());
            System.out.println("motoren er tændt");
        }
    }

    public void motor() {
        boolean tændt = motor.isOnOff();
        if (tændt == true) {
            System.out.println("Motoren er tændt");
        } else {
            System.out.println("Motoren er slukket");
        }
    }

    public Bil(String biltype, String model, String stelnummer, int antalDøre, String softwareV, double gpsX, double gpsY, double hastighed) {
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antalDøre = antalDøre;
        this.softwareV = softwareV;
        this.gpsX = gpsX;
        this.gpsY = gpsY;
        this.hastighed = hastighed;
    }


    @Override
    public String toString() {
        return "Bil{" +
                "biltype='" + biltype + '\'' +
                ", model='" + model + '\'' +
                ", stelnummer='" + stelnummer + '\'' +
                ", antalDøre=" + antalDøre +
                ", softwareV='" + softwareV + '\'' +
                ", gpsX=" + gpsX +
                ", gpsY=" + gpsY +
                ", hastighed=" + hastighed +
                '}';
    }
}


