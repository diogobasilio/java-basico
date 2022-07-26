package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        double media = 0.0;
        double somaPares = 0.0;
        int qntPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite %d° numero:", i + 1);
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                qntPares++;
            }
        }

        if (somaPares > 0) {
            media = somaPares / qntPares;
            System.out.printf("MEDIA DOS PARES %.1f", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }

}
