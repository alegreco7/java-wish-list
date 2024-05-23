package org.exercise.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaRegaliNatale {
    public static void main(String[] args) {
        // Creazione dello scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Creazione della lista di regali
        ArrayList<String> listaRegali = new ArrayList<>();

        // Variabile per controllare se continuare o fermarsi
        boolean continua = true;

        // Ciclo che continua a chiedere il nome del regalo finché l'utente non decide di fermarsi
        while (continua) {
            System.out.print("Inserisci il nome del regalo: ");
            String regalo = scanner.nextLine();
            // Aggiungere il regalo alla lista
            listaRegali.add(regalo);

            // Mostrare la lunghezza della lista
            System.out.println("Lunghezza della lista: " + listaRegali.size());

            // Chiedere all'utente se vuole continuare
            System.out.print("Vuoi aggiungere un altro regalo? (s/n): ");
            String risposta = scanner.nextLine();

            // Verificare se l'utente vuole continuare o fermarsi
            if (risposta.equalsIgnoreCase("n")) {
                continua = false;
            }
        }

        // Ordinare la lista dei regali
        Collections.sort(listaRegali);

        // Stampare la lista ordinata
        System.out.println("Lista dei regali ordinata:");
        for (String regalo : listaRegali) {
            System.out.println(regalo);
        }


        scanner.close();
    }
}

