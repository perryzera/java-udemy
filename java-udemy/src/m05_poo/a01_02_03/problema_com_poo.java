package m05_poo.a01_02_03;
import java.util.Scanner;

public class problema_com_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area_x = x.area();
        double area_y = y.area();

        System.out.printf("Triangle X area: %.4f%n", area_x);
        System.out.printf("Triangle Y area: %.4f%n", area_y);
    }
}
