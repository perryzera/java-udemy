package m03_estrutura_repetitiva.ex_while;

// Ex04 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus
// clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
// (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um
// código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
// O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem:
// "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

import java.util.Scanner;

public class ex03_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao posto do PCC!");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");
        System.out.printf("Digite o código referente ao combustível adulterado desejado: ");
        int code = sc.nextInt();
        int a = 0, g = 0, d = 0;

        while (code != 4) {
            while (code == 1) {
                a ++;
                break;
            } while (code == 2) {
                g ++;
                break;
            } while (code == 3) {
                d++;
                break;
            }
            System.out.print("Digite o código: ");
            code = sc.nextInt();
        }
        System.out.println("Muito obrigado por financiar o tráfico.");
        System.out.println("Álcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);
        sc.close();
    }
}
