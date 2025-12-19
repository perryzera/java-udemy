package m02_estrutura_condicional.ex;

// EX04 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

import java.util.Scanner;

public class ex04_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, duracao;

        System.out.printf("Digite o horário que começou o jogo: ");
        inicio = sc.nextInt();
        System.out.printf("Digite o horário em que encerrou o jogo: ");
        fim = sc.nextInt();

        duracao = inicio - fim;

        if (duracao > 1 && duracao < 24) {
            System.out.printf("O jogo durou %d hora(s)", duracao);
        } else if (duracao < 0){
            System.out.println("A duração do jogo não pode durar menos que 1 hora.");
            } else {
                System.out.println("A duração do jogo não pode ser maior que 24 horas");
            }
        sc.close();
        }
    }
