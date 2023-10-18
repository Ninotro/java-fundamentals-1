package org.java.fundamentals;

import java.util.Scanner;

public class TreinTickets {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
//        Chiedo i kilometri
        int kilometers;
        System.out.println("Quanti kilometri deve percorrere? ");
        kilometers = keyboardInput.nextInt();
//        chiedo l'età'

        int age;
        System.out.println("Quanti anni ha?? ");
        age = keyboardInput.nextInt();

        double prezzoBigliettoPieno = 0.21 * kilometers;
        double prezzoBigliettoRidotto;

        if (age < 18 ){
            prezzoBigliettoRidotto = prezzoBigliettoPieno - ((prezzoBigliettoPieno/100)*20);
        } else if (age > 65 ) {

            prezzoBigliettoRidotto = prezzoBigliettoPieno - ((prezzoBigliettoPieno/100)*40);
            
        }

        else {
            prezzoBigliettoRidotto=prezzoBigliettoPieno;
        }

        System.out.println( "Il costo del suo biglietto sarà " + prezzoBigliettoRidotto + "Euro");


        keyboardInput.close();
    }
}
