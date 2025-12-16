package m01_estrutura_sequencial.ex;

import java.util.Locale;
import java.util.Scanner;

// EX02 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.

// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

public class ex03_modulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, area, pi, raio;
        pi = 3.14159;

        System.out.printf("Digite o valor do raio de um círculo, em cm: ");
        x = sc.nextDouble();

        raio = Math.sqrt(x);
        area = pi * raio;

        System.out.printf("A área do círculo com %.0f cm de raio, possui %.2f cm² de área.", x, area);

        sc.close();
    }
}
