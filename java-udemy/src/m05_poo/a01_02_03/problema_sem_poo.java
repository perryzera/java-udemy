package m05_poo.a01_02_03;

import java.util.Scanner;

public class problema_sem_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double p_x = (a + b + c) / 2;
        double area_x = Math.sqrt(p_x*(p_x-a)*(p_x-b)*(p_x-c));

        double p_y = (d + e + f) / 2;
        double area_y = Math.sqrt(p_y*(p_y-d)*(p_y-e)*(p_y-f));

        System.out.printf("Triangle X area: %.4f%n", area_x);
        System.out.printf("Triangle Y area: %.4f%n", area_y);
    }
}
