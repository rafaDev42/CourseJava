import java.util.Locale;
import java.util.Scanner;

public class Exercises02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Exercise 1
        int number;

        System.out.println("Enter the integer number: ");
        number = sc.nextInt();

        if (number <= 0) {
            System.out.printf("NEGATIVE", number);
        } else {
            System.out.printf("POSITIVE", number);
        }
        ----------------------------------------------------------
        Exercise 2

        int number;

        System.out.println("Ok, now let'see if a number is odd or even");
        System.out.println("Enter integer number here: ");
        number = sc.nextInt();


        if(number % 2 == 0) {
            System.out.printf("This is a even number", number);
        } else{
            System.out.printf("This is a odd number", number);
        }

        --------------------------------------------------------
        Exercise 3

        int A, B;

        System.out.println("Let's see if the numbers A and B are multiples of each other");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A % B  == 0 || B % A == 0){
            System.out.println("Are Multiples");
        } else {
            System.out.println("Not are multiples");
        }

        --------------------------------------------------------
        Exercise 4

        int start = sc.nextInt();
        int ending = sc.nextInt();
        int duration;

        if(start < ending){
            duration = start - ending;
        } else {
            duration = 24 - start + ending;
        }

        System.out.printf("The game lasted " + duration + " hour(s) ");

        --------------------------------------------------------
        Exercise 4
        */
        System.out.println("What is the product number of you choice ?");
        int product = sc.nextInt();
        System.out.println("Whats the quantity ? ");
        int quantity = sc.nextInt();
        double total;

        if (product == 1){
            total = quantity * 4.00;
            System.out.printf("Your order is a %d Hot Dog(s) and it costs: $ %.2f", quantity, total);
        } else if (product == 2) {
            total = quantity * 4.50;
            System.out.printf("Your order is a %d X-Salad(s) and it costs: $ %.2f", quantity, total);
        } else if (product == 3) {
            total = quantity * 5.00;
            System.out.printf("Your order is a %d X-Bacon(s) and it costs: $ %.2f", quantity, total);
        } else if (product == 4) {
            total = quantity * 2.00;
            System.out.printf("Your order is a %d Simple Toast(s) and it costs: $ %.2f", quantity, total);
        } else {
            total = quantity * 1.50;
            System.out.printf("Your order is a %d Soda(s) and it costs: $ %.2f", quantity, total);
        }

        sc.close();
    }
}
