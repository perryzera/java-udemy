package m03_estrutura_repetitiva.ex;

// Ex02 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada
// de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
// (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class ex02_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o ponto X: ");
        int x = sc.nextInt();
        System.out.printf("Digite o ponto Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x >= 0 && y >= 0) {
                System.out.println("Primeiro quadrante");
            } else if(x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
