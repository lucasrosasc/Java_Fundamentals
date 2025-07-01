package com.basic;

import java.util.Scanner;

public class CalculadoraTabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Tabuada ---");
        System.out.print("Digite um número de 1 a 10 para ver a sua tabuada: ");

        try {
            int numero = scanner.nextInt();
            System.out.println("\nTabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } catch (Exception e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}
