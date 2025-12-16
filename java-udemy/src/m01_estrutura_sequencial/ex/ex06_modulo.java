package m01_estrutura_sequencial.ex;


// EX05 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class ex06_modulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double vl1, vl2, vt;

        System.out.println("CONTROLE FINANCEIRO DE PEÇAS");
        System.out.println("Digite: ");
        System.out.println("CÓDIGO | QUANTIDADE | VALOR");
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        vl1 = sc.nextDouble();

        System.out.println("Digite: ");
        System.out.println("CÓDIGO | QUANTIDADE | VALOR");
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        sc.nextLine();
        vl2 = sc.nextDouble();

        vt = qtd1 * vl1 + qtd2 * vl2;

        System.out.printf("Valor a pagar: R$%.2f", vt);
        sc.close();
    }
}
