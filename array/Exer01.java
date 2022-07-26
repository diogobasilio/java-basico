package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite %d° numero:", i + 1);
            vector[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int x = 0; x < vector.length; x++) {
            if (vector[x] < 0) {
                System.out.println(vector[x]);
            }
        }

        sc.close();

    }

}
