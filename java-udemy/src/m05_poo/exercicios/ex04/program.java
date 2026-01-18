package m05_poo.exercicios.ex04;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        student student = new student();

        System.out.printf("Nome do aluno: ");
        student.name = sc.nextLine();
        System.out.printf("Nota 1: ");
        student.n1 = sc.nextDouble();
        System.out.printf("Nota 2: ");
        student.n2 = sc.nextDouble();
        System.out.printf("Nota 3: ");
        student.n3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.media());
        if (student.media() > 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.rest() + " POINTS");
        }
        sc.close();
    }
}
