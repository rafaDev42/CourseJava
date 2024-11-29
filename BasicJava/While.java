import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Here, i put on the exercises about the structure 'While'.
        Let's practice now!
        int x = sc.nextInt();
        int sum = 0;

        while(x != 0) {
            sum = sum + x;
            x = sc.nextInt();
        }
        //The variable 'sum' accumulate the values entered by the user
        //Then, the new number x is added again, this is 'repetitive structure' or simply a 'loop'
        System.out.printf("Sum: %d", sum);


        Exercise 01


        int cKey = 2002; //the word 'key' is smaller than 'password'
        int iKey;
        System.out.println("Enter your password: ");
        iKey = sc.nextInt();

        while(iKey != cKey){
            System.out.println("Invalid password");
            System.out.println("Try again: ");
            iKey = sc.nextInt();
        }

        System.out.println("Access permissioned!");
        ----------------------------------------------------------------------
        Exercise 2

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("first");
            } else if (x < 0 && y > 0) {
                System.out.println("second");
            } else if (x < 0 && y < 0) {
                System.out.println("third");
            } else {
                System.out.println("forth");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        ----------------------------------------------------------------------
        Exercise 3


        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int type = sc.nextInt();

        while (type != 4) {
            if (type == 1) {
                alcohol += 1;
            } else if (type == 2) {
                gasoline += 1;
            } else if (type == 3) {
                diesel += 1;
            }

            type = sc.nextInt();
        }

        System.out.println("Thank you for your purchase!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        Done more one module of the Java's course, this time about the 'While' structure */

        // Do While
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");

            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n) ? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
