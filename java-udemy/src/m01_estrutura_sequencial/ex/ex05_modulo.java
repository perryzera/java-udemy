package m01_estrutura_sequencial.ex;

import java.util.Locale;
import java.util.Scanner;

// EX04 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class ex05_modulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int mat, hr, vlr;
        double salary;

        System.out.printf("Digite a matrícula de um funcionário: ");
        mat = sc.nextInt();
        System.out.printf("Digite o número de horas trabalhadas por dia: ");
        hr = sc.nextInt();
        System.out.printf("Digite o valor que esse funcionário recebe por horas: ");
        vlr = sc.nextInt();

        salary = hr * vlr;

        System.out.printf("Funcionário: OVD%d\n", mat);
        System.out.printf("Salário: R$%.2f", salary);
    }
}
