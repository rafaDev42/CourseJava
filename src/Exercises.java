import java.util.Locale;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Exercicio da aula
		/*
		 * String product1 = "Computer"; String product2 = "Office Desk";
		 *
		 * int age = 30; int code = 5290; char gender = 'F';
		 *
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 *
		 * System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		 * System.out.printf("%s, which price is $%.2f \n", product2, price2);
		 * System.out.printf("Record: %d years old, code %d and gender: %s \n", age,
		 * code, gender);
		 *
		 * System.out.printf("Measure with eight decimal places %.8f \n", measure);
		 * System.out.printf("Rouded (three decimal places): %.3f \n", measure);
		 * System.out.printf("US decimal point: %.3f ", measure);
		 * Locale.setDefault(Locale.US);
		 ---------------------------------------------------------------------
		 Exercício proposto - 1

		System.out.println("The program realizes a sum of two numbers.\n");
		System.out.println("Put on the first number\n");
		int number1 = sc.nextInt();

		System.out.println("Now, put on the second number\n");
		int number2 = sc.nextInt();

		System.out.println("Ok, nice! Now we have two number and we can realize the sum of these numbers, denominated number 1 and number 2\n");

		int sum = number1 + number2;

		System.out.printf("The sum of the number1 and number2, is: %d", sum);

		---------------------------------------------------------------------
		Exercicio proposto - 2


		double pi = 3.14159;
		double radius, area;

		System.out.println("Now, lets create a tiny calculator for show us the  circle's area!");
		System.out.println("Put on a circle's radius: ");
		radius = sc.nextDouble();

		area = pi * Math.pow(radius, 2);

		System.out.printf("The circle's area is: %.4f", area);


		// Resultados: 1- 12,5664 | 2- 31819,3103 | 3- 70685,7750 | tudo ok
		---------------------------------------------------------------------
		Exercicio proposto - 3

		int A, B, C, D, diff;

		System.out.println("Enter four values. We calculate A*B and C*D and return for you the difference between the products of these multiplication");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		diff = A * B - C * D;

		System.out.printf("The difference between numbers is: %d", diff);

		---------------------------------------------------------------------
		Exercicio proposto - 4


		int employee, hourWorked;
		double valueHour, salary;

		System.out.println("This program calculate your monthly salary");
		System.out.println("Put on your employee number:");
		employee = sc.nextInt();

		System.out.println("Enter your worked hours:");
		hourWorked = sc.nextInt();

		System.out.println("Now, enter your salary per hour:");
		valueHour = sc.nextDouble();

		salary = hourWorked * valueHour;
        .
		System.out.printf("Your salary is = $ %.2f", salary);
		---------------------------------------------------------------------
		Exercicio proposto - 5
        */
        int cod1, cod2, qt1, qt2;
        double price1, price2, total;

        System.out.println("Enter the first product code, quantity and value: ");
        cod1 = sc.nextInt();
        qt1 = sc.nextInt();
        price1 = sc.nextDouble();
        System.out.println("Enter the second product code, quantity and value: ");
        cod2 = sc.nextInt();
        qt2 = sc.nextInt();
        price2 = sc.nextDouble();

        total = qt1 * price1 + qt2 * price2;

        System.out.printf("Total of your purchase is = %.2f ", total);

        sc.close();
    }

}
