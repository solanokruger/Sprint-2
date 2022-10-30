package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrada: ");
        String entrada = scan.nextLine();

        char[] caracteres = entrada.toCharArray();
        ValidarFrase validarFrase = new ValidarFrase();

        String status = validarFrase.validarFrase(caracteres, entrada);
        System.out.println("Saída: " + status);

        scan.close();
    }
}
