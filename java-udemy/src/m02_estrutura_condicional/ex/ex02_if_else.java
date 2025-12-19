package m02_estrutura_condicional.ex;
import java.util.Scanner;

// EX02 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
public class ex02_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.printf("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        sc.close();
    }
}
