package com.exercicios.array.exer03;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d° pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sum += altura;
            vetor[i] = new Pessoa(nome, idade, altura);
        }
        System.out.println();
        System.out.printf("Altura média %.2f\n", sum / vetor.length);

        int nMenores = 0;
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j].getIdade() < 16) {
                nMenores++;
            }
        }
        double percMenores = nMenores * 100 / vetor.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f", percMenores);
        System.out.println("%");

        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x].getIdade() < 16) {
                System.out.println(vetor[x].getNome());
            }
        }

        sc.close();
    }

}
