import java.util.Locale;
import java.util.Scanner;

public class Exercises03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Exercise 1
        int x = sc.nextInt();
        This code show for us they odd numbers in that interval
        for(int i = 0; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        -------------------------------------------------------------------

        Exercise 2

        This code show for us how many number existing in interval of major or equals at 10 and minor or equals at 20
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x>=10 && x<=20){
                in = in + 1;
            } else
                out = out + 1;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        ----------------------------------------------------------------------

        Exercise 3
        That program, ask to user one integer number
        If the answer is '3' the user can enter 3 decimal numbers, and the program give back the 'average' of the numbers



        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", average);
        }
        -----------------------------------------------------------------------------
        Exercise 4

        //Calculate and return the division of two numbers, if the division not be possible, return an error
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Impossible division");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        ----------------------------------------------------------------------------

        Exercise 5

        Calculate the factorial of the User number
        int n = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++){
            fat = fat * i;
        System.out.printf("The fatorial of number " + n + " is: " + fat);
        }
        -------------------------------------------------------------------

        Exercise 6


        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        -------------------------------------------------------------------

        Exercise 7
        */
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int first = i;
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d%n", first, second, third);
        }

        sc.close();
    }
}