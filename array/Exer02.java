package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for(int i = 0; i < vector.length; i++) {
            System.out.printf("Digite %d° numero: ", i + 1);
            vector[i] = sc.nextDouble();
        }
        System.out.println();
        double sum = 0.0;

        System.out.print("VALORES = ");

        for(int j = 0; j < vector.length; j++) {
            sum += vector[j];
            System.out.print(vector[j] + " ");
        }
        double avg = sum / vector.length;
        System.out.println();
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f", avg);






        sc.close();
    }

}
