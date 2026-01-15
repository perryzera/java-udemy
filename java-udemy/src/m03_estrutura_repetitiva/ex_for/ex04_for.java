package m03_estrutura_repetitiva.ex_for;
import java.util.Locale;
import java.util.Scanner;

// Ex04 - Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do
// primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class ex04_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Digite o número de testes que serão feitos: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            double div = 0;
            System.out.printf("Digite um número: ");
            int x = sc.nextInt();
            System.out.printf("Digite um número: ");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível.");
            } else {
                div = (double) x / y;
                System.out.printf("Divisão: %.1f%n", div);
            }
        }
        sc.close();
    }
}
