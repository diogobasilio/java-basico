package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] grade = new double[n];


        double maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int i = 0; i < grade.length; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            grade[i] = sc.nextDouble();
            if (grade[i] > maior) {
                maior = grade[i];
                indiceMaior = i;
            }
        }
        System.out.printf("Maior número é %.1f, no índice %d", maior, indiceMaior);


        sc.close();
    }

}
