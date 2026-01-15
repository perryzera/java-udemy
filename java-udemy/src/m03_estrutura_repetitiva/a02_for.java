package m03_estrutura_repetitiva;
import java.util.Scanner;

// Regra do FOR:
// executa apenas na primeira vez
// V: executa e volta F: pula fora
// executar toda vez depois de voltar

// usa-se quando você sabe a quantidade de vezes que irá repetir

public class a02_for{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite quantos números inteiros serão inseridos: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i=0; i < n; i++) {
            System.out.printf("Digite o número a ser somado: ");
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
