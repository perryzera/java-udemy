package m03_estrutura_repetitiva.ex_while;

import java.util.Scanner;

// Ex01 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

public class ex01_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int pass = sc.nextInt();

        while (pass != 2002) {
            System.out.println("Senha Inválida.");
            System.out.println("Digite a senha: ");
            pass = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
        sc.close();
    }
}
