package m03_estrutura_repetitiva.ex_for;
import java.util.Locale;
import java.util.Scanner;

// Ex03 - Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
// Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
// Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que
// o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

public class ex03_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Digite o número de testes que serão feitos: ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
        System.out.printf("Insira um número com uma casa decimal: ");
        double x = sc.nextDouble();
        System.out.printf("Insira um número com uma casa decimal: ");
        double y = sc.nextDouble();
        System.out.printf("Insira um número com uma casa decimal: ");
        double z = sc.nextDouble();

        double media = (x * 2.0) + (y * 3.0) + (z * 5.0) / 10;

        System.out.printf("Média: %.2f%n", media);
        }

        sc.close();
    }
}
