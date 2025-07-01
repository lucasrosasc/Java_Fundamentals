package com.basic;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cálculo de área do retângulo ---");

        System.out.println("Digite o tamanho da base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o tamanho da altura: ");
        int altura = scanner.nextInt();

        scanner.close();
        System.out.println("A fórmula da área do retângulo é base x altura.");
        System.out.printf("A área do retângulo com base %s e altura %s é %s \n", base, altura, (base * altura));

    }
}
