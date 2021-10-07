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
            System.out.println("Skriv en kommando: start, stop, exit .... ");
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


        }



    }
}
