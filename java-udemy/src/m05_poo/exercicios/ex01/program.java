package m05_poo.exercicios.ex01;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product product = new product();

        System.out.println("Enter product data: ");
        System.out.printf("Name: ");
        product.name = sc.nextLine();
        System.out.printf("Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product " + product);
        System.out.println();

        System.out.printf("Enter the number of products to be added in stock: ");
        // Entrada de valor para uma classe
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated " + product);
        System.out.println();

        System.out.printf("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated " + product);

        sc.close();
    }
}
