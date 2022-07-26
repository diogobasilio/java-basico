package com.exercicios.array;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        int numeroHomens = 0;
        int numeroMulheres = 0;
        double mediaAlturaMulheres = 0.0;
        double somaMulheres = 0.0;
        double maiorAltura = Integer.MIN_VALUE;
        double menorAltura = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d° pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %d pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);

            if (genero[i] == 'M') {
                numeroHomens++;
            } else {
                numeroMulheres++;
                somaMulheres += altura[i];
            }
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", somaMulheres / numeroMulheres);
        System.out.printf("Numero de homens = %d", numeroHomens);


        sc.close();
    }

}
