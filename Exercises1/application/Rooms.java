package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Rooms {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many n will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #" + i + ": ");
            System.out.print("\nName: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("\nBusy Rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
