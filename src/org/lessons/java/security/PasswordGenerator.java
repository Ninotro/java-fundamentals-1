package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

//        Chiedo il nome
        String name;
        System.out.println("Quale è il tuo nome? ");
        name = keyboardInput.nextLine();
//        Chiedo il cognoome
        String surname;
        System.out.println("Quale è il tuo Cognome? ");
        surname = keyboardInput.nextLine();
        //        Chiedo il colore
        String favouriteColor;
        System.out.println("Quale è il suo colore preferito? ");
        favouriteColor = keyboardInput.nextLine();
        //        Chiedo la data di nascita
        String dateOfBirth;
        System.out.println("Quaando è nato? inserisca in formato dd/mm/yyyy ");
        dateOfBirth = keyboardInput.nextLine();
//li divido e mi prendo i dati
        String [] partiData = dateOfBirth.split("/");
        int giorno = Integer.parseInt(partiData[0]);
        int mese = Integer.parseInt(partiData[1]);
        int anno = Integer.parseInt(partiData[2]);


        String Password = name + "-" + surname + "-" + favouriteColor + "-" + (giorno+mese+anno);

        System.out.println("La sua sicurissima password sarà:" + Password);


        keyboardInput.close();
    }
}
