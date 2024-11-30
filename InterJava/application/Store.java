package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        //Constructor
        Product product = new Product(name, price);

        //accessing and changing data using getters and setters
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("\nProduct Data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nUpdated data: " + product);

        sc.close();

        //The program turn more efficient and beautiful with OOP
    }
}