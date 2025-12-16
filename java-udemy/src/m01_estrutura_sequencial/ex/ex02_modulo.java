package m01_estrutura_sequencial.ex;
import java.util.Scanner;


// EX 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

public class ex02_modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.printf("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.printf("Digite outro número inteiro: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("Soma = " + soma);

        sc.close();
    }
}
