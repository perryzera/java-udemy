package m02_estrutura_condicional.ex;

// EX01 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class ex01_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.printf("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x > 0) {
            System.out.println("O número inserido é positivo.");
        } else {
            System.out.println("O número inserido é negativo.");
        }
    }
}
