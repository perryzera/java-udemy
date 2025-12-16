package m01_estrutura_sequencial.ex;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
// Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B

import java.util.Locale;
import java.util.Scanner;

public class ex07_modulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, c_raio, b_area, area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;

        System.out.printf("Digite o ponto flutuante A: ");
        a = sc.nextDouble();
        System.out.printf("Digite o ponto flutuante B: ");
        b = sc.nextDouble();
        System.out.printf("Digite o ponto flutuante C: ");
        c = sc.nextDouble();

        c_raio = Math.pow(c, 2);
        b_area = Math.pow(b, 2);

        area_triangulo = (a * c) / 2;
        area_circulo = c_raio * (3.14159);
        area_trapezio = ((a + b) * c) / 2;
        area_quadrado = b_area;
        area_retangulo = a * b;

        System.out.printf("Triângulo: %.3f\n", area_triangulo);
        System.out.printf("Círculo: %.3f\n", area_circulo);
        System.out.printf("Trapézio: %.3f\n", area_trapezio);
        System.out.printf("Quadrado: %.3f\n", area_quadrado);
        System.out.printf("Retângulo: %.3f\n", area_retangulo);

        sc.close();
    }
}
