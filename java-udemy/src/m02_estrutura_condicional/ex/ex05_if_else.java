package m02_estrutura_condicional.ex;
import java.util.Locale;
import java.util.Scanner;

// EX05 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
// A seguir, calcule e mostre o valor da conta a pagar
// CODIGO       ESPECIFICAÇÃO       PREÇO
//      1       CACHORRO-QUENTE     R$4.00
//      2       X-SALADA            R$4.50
//      3       X-BACON             R$5.00
//      4       TORRADA             R$2.00
//      5       REFRIGERANTE        R$1.50

public class ex05_if_else {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double valor, pedido;

        System.out.println("Seja Bem-Vindo(a) ao restaurante da Palmirinha!");
        System.out.println("===========  Cardápio  =========== ");
        System.out.println("Código |      Lanche       | Preço");
        System.out.println(" 1     | Cachorro Quente   | R$4,00");
        System.out.println(" 2     | X-Salada          | R$4,50");
        System.out.println(" 3     | X-Bacon           | R$5,00");
        System.out.println(" 4     | Torrada Simples   | R$2,00");
        System.out.println(" 5     | Refrigerante      | R$1,50");
        System.out.println();
        System.out.printf("Digite o código do seu lanche desejado: ");
        cod = sc.nextInt();
        System.out.printf("Digite a quantidade desse item: ");
        qtd = sc.nextInt();

        valor = 0;

        if (cod == 1) {
            valor =+ 4;
        } else if (cod==2) {
            valor =+4.5;
        } else if (cod==3) {
            valor =+5;
        } else if (cod==4) {
            valor =+2;
        } else if (cod==5) {
            valor =+1.5;
        }
        pedido = valor * qtd;
        System.out.printf("Seu pedido totalizou R$%.2f", pedido);
    }
}
