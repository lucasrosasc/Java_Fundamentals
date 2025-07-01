package com.basic;

import java.util.Scanner;

public class InputNomeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Leitor de Dados ---");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nOlá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close();
    }
}
