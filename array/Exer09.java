package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];

        double maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d° pessoa: \n", i + 1);
            System.out.print("Nome: ");
            vetorNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            if (vetorIdade[i] > maior) {
                maior = vetorIdade[i];
                indiceMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", vetorNome[indiceMaior]);


        sc.close();
    }
}
