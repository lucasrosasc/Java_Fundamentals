package com.basic;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cálculo de área do quadrado ---");

        System.out.println("Digite o tamanho do lado: ");
        int lado = scanner.nextInt();

        scanner.close();
        System.out.println("A fórmula da área do quadrado é lado x lado.");
        System.out.printf("A área do quadrado com lado de tamanho %s é %s \n", lado, (lado * lado));

    }
}
