package m03_estrutura_repetitiva.ex_for;
import java.util.Scanner;

// Ex01 - Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

public class ex01_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
