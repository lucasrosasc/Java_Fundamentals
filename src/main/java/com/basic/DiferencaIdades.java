package com.basic;

import java.util.Scanner;

public class DiferencaIdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cálculo de diferença de idades. ---");

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.next();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.next();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        scanner.close();

        int diferenca = Math.abs(idade1 - idade2);
        if (diferenca == 0) {
            System.out.printf("%s e %s têm a mesma idade, %s anos. \n", nome1, nome2, idade1 );
        }
        System.out.printf("A diferença de idade entre %s e %s é de %s anos. \n", nome1, nome2, diferenca);
        if (idade1 > idade2) {
            System.out.printf("%s é mais experiente que %s por %s anos. \n", nome1, nome2, diferenca);
        }
        System.out.printf("%s é mais experiente que %s por %s anos. \n", nome2, nome1, diferenca);



    }
}
