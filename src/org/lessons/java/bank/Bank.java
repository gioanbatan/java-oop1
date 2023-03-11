package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;

        System.out.print("Inserire il nome: ");
        userName = scan.nextLine();

        Conto count1 = new Conto();
        count1.setUserName(userName);
        System.out.println("Il nome utente del conto è " + count1.getUserName());
        System.out.println();

        System.out.println("Il numero di conto assegnato è " + (count1.getCode()));
        System.out.println();

        System.out.println("Il tuo saldo attuale è:");
        System.out.println(count1.getFormattedBalance());
        Separation();

        int userSelection;
        do {
            System.out.println("Seleziona una azione:");
            System.out.println("- 1 Versa una somma di denaro");
            System.out.println("- 2 Preleva una somma di denaro");
            System.out.println("- 3 Esci");
            userSelection = Integer.parseInt(scan.nextLine());

            switch (userSelection) {
                case 1: {
                    System.out.println(count1.getUserName() + " quale somma di denaro vuoi versare sul conto " + count1.getCode() + " ?");
                    count1.deposit(Double.parseDouble(scan.nextLine()));

                    System.out.println("Il tuo saldo attuale è di " + count1.getFormattedBalance());
                    Separation();
                    break;
                }
                case 2: {
                    System.out.println(count1.getUserName() + " quale somma di denaro vuoi prelevare sul conto " + count1.getCode() + " ?");
                    count1.withdraw(Double.parseDouble(scan.nextLine()));

                    System.out.println("Il tuo saldo attuale è di " + count1.getFormattedBalance());
                    Separation();
                    break;
                }
            }
        } while (userSelection != 3);

        System.out.println("Ciao!");
    }

    public static void Separation() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
