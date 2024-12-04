package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMinors;
        double totalHeight, averageHeight, minorsPercent;

        System.out.println("How many people's will be participating?");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of people %d : ", i + 1);
            System.out.print("\nName: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        nMinors = 0;
        totalHeight = 0;

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                nMinors++;
            }
            totalHeight += height[i];
        }

        averageHeight = totalHeight / n;
        minorsPercent = ((double) nMinors / n ) * 100.0;

        System.out.printf("\nAverage height %.2f", averageHeight);
        System.out.printf("\nPeoples minor than 16 years old: %.1f\n", minorsPercent);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();
    }
}
