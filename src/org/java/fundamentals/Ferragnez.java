package org.java.fundamentals;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {
        String [] invitati =
                {
                        "Dua Lipa", "Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti",
                        "Ilary Blasi","Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone","Rachel Zeilic"
                };

//        creo un menu testuale

        Scanner keyboardInput = new Scanner(System.in);
        String nomeInvitato;
        System.out.println("Quale è il suo nome?");
        nomeInvitato = keyboardInput.nextLine();
        boolean found = false;
//        con ciclo for
        for (int i = 0; i < invitati.length ; i++) {
            if (nomeInvitato.equalsIgnoreCase(invitati[i]) ) {
               found = true;
            }
        }


        if (found) {
            System.out.println("Lei puo entrare");
        }

        else {
            System.out.println("lei non puo entrare");
        }

        keyboardInput.close();
    }

}
