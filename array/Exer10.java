package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] aluno = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: \n", i + 1);
            sc.nextLine();
            aluno[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");
        for (int j = 0; j < n; j++) {
            if ((nota1[j] + nota2[j]) / 2 >= 6.0) {
                System.out.println(aluno[j]);
            }
        }



        sc.close();
    }
}
