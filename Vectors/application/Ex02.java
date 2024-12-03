package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number you will enter?");
        int n = sc.nextInt();

        double sum, average;

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Type number:");
            numbers[i] = sc.nextDouble();
        }

        sum=0;
        for(int i=0; i<n; i++){
            sum += numbers[i];
        }

        average = sum / n;

        System.out.println("VALUES: ");

        for (int i=0; i<n;i++) {
            System.out.printf("%.1f ", numbers[i]);
        }

        System.out.printf("\nSUM: %.2f", sum);
        System.out.printf("\nAverage: %.2f ", average);

        sc.close();
    }
}
