package m01_estrutura_sequencial;

import java.util.Scanner;

public class a02_entrada_dados {
    public static void main(String[] args) {

        // inicia a variável para leitura
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char a;

        System.out.print("Digite o seu primeiro nome: ");
        // entrada de uma string
        x = sc.next();

        System.out.print("Digite a sua idade: ");
        // entrada de um int
        y = sc.nextInt();

        System.out.print("Digite a sua altura: ");
        // entrada de um double
        z = sc.nextDouble();

        System.out.printf("Digite o seu gênero (M)/(F): ");
        // entrada de x caracteres
        a = sc.next().charAt(0);

        // encerra o sc para leitura
        sc.close();
        System.out.printf("%s tem %d anos, possui %.2fm de altura e é do sexo %c", x, y, z, a);
    }
}
