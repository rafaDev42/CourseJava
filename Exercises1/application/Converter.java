package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar Price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        System.out.println("Very expensive? MAKE THE L!");

        sc.close();
    }
}
