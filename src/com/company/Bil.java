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


   Ret ret = new Ret();
   Bremse bremse = new Bremse();
   Motor motor = new Motor(false);
   Hjul hjul = new Hjul();

    public void turnOn(String input){
        if(input.equals("y")){
            motor.setOnOff(true);
        }
        else{
            motor.setOnOff(false);
        }
    }

    public void motor(){
        boolean tændt = motor.isOnOff();
        if(tændt == true){
            System.out.println("Motoren er tændt");
        }
        else{
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

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getSoftwareV() {
        return softwareV;
    }

    public void setSoftwareV(String softwareV) {
        this.softwareV = softwareV;
    }

    public double getGpsX() {
        return gpsX;
    }

    public void setGpsX(double gpsX) {
        this.gpsX = gpsX;
    }

    public double getGpsY() {
        return gpsY;
    }

    public void setGpsY(double gpsY) {
        this.gpsY = gpsY;
    }

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }
}
