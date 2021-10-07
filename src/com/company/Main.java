package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    Bil bil = new Bil("Tesla", "Model x", "2243432",4, "0.0.1", 56.22458, 11.757075, 0 );
        System.out.println(bil.toString());
        bil.motor();
        
        System.out.println("Type 'y' if you want to turn on the motor");
        String turnOn = input.nextLine();
        bil.turnOn(turnOn);
        bil.motor();



    }
}
