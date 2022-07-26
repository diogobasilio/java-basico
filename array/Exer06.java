package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int x = 0; x < vetorB.length; x++) {
            vetorB[x] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int j = 0; j < vetorC.length; j++) {
            vetorC[j] = vetorA[j] + vetorB[j];
            System.out.println(vetorC[j]);
        }

        sc.close();
    }

}

