package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner input = new Scanner(System.in);
	    Bil tesla = new Bil("Tesla", "Model x", "2243432",4, "0.0.1", 56.22458, 11.757075, 0 );
        System.out.println(tesla.toString());

        while(!stop){
            System.out.println("Skriv en kommando: start, stop, exit, turn, .... ");
            String kommando = input.nextLine();
            if(kommando.equals("start")){
                tesla.turnOn(true);
            }
            else if(kommando.equals("stop")){
                tesla.turnOn(false);
            }
            else if(kommando.equals("exit")){
                stop = true;
            }
            else if(kommando.equals("turn")){
                System.out.println("the wheel can turn 90 degrees to the left and 90 degrees to the right. from 0 to -90 the wheels turning left, from 0 - 90 the wheel is turning right.\ninsert the amount of degrees you want to turn with.");
                int deg = input.nextInt();
                tesla.turnRat(deg);

            }


        }



    }
}
