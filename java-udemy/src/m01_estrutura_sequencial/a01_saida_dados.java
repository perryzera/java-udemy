package m01_estrutura_sequencial;

import java.util.Locale;

public class a01_saida_dados {
    public static void main(String[] args) {
        // printLN = pula uma linha
        // print = na mesma linha
        System.out.println("pula uma linha");
        System.out.print("na mesma linha");

        int y = 32;
        System.out.println();
        // visualizar var
        System.out.println(y);

        double x = 10.41243;
        // visualizar o numero inteiro
        System.out.println(x);
        // visualizar 2 numeros decimais
        System.out.printf("%.2f", x);
        // visualizar 2 numeros decimais, pulando linha
        System.out.printf("%.2f%n", x);
        // visualizar 4 numeros decimais, pulando linha
        System.out.printf("%.4f%n", x);

        // separador '.' ao inves de ','
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        // concatenar string + var + string
        System.out.println("resultado: " + x + " mestros");
        // outra forma de concatenar string + var + string
        System.out.printf("resultado: %.2f metros%n", x);


        String nome = "Maria";  // %s > string
        int idade = 31;         // %d > int
        double renda = 4000.0;  // %f > double
        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);

    }
}