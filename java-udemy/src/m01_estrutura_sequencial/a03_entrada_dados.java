package m01_estrutura_sequencial;

import java.util.Scanner;

public class a03_entrada_dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        // para receber um valor de qualquer outro tipo, e logo em seguida receber um nextLine
        // é necessário fazer mais um nextLine extra

        x = sc.nextInt();
        sc.nextLine();  // nextLine() extra para quebra de linha
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
