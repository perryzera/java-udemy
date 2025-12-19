package m02_estrutura_condicional;

import java.util.Scanner;

public class a04_condicional_ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco;

        System.out.printf("Digite o preço: ");
        preco = sc.nextDouble();
        // condicional ternária:
        // se V utiliza o (preço * 0.1), se F utiliza o (preço * 0.5)
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;

        System.out.println(desconto);
        sc.close();
    }
}
