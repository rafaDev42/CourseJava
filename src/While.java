import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        while(x != 0) {
            sum = sum + x;
            x = sc.nextInt();
        }
        //The variable 'sum' accumulate the values entered by the user
        //Then, the new number x is added again, this is 'repetitive structure' or simply a 'loop'
        System.out.printf("Sum: %d", sum);

        sc.close();
    }
}
