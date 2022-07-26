package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPar = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            vector[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int y = 0; y < vector.length; y++) {
            if (vector[y] % 2 == 0) {
                int nPar = vector[y];
                System.out.print(nPar + " ");
                qntPar++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + qntPar);

        sc.close();
    }

}
