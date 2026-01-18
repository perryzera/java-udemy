package m05_poo.exercicios.ex03;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee employee = new employee();

        System.out.printf("Name: ");
        employee.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println();

        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee.name + ", $ " + employee.netSalary());

        sc.close();
    }
}
