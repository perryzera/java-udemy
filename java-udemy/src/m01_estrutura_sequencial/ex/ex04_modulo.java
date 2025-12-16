package m01_estrutura_sequencial.ex;

import java.util.Scanner;

// EX03 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class ex04_modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        double dif;

        System.out.printf("Digite um número inteiro: ");
        a = sc.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        b = sc.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        c = sc.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        d = sc.nextInt();

        dif = (a * b - c * d);
        System.out.printf("Diferença: %.0f", dif);
    }
}
