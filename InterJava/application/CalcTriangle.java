package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class CalcTriangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //import and instantiation of the variables
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();//Developing a method with the function 'Math'
        double areaY = y.area();//turning more easily the implementation of this code
                                //Making code more elegant and visually appealing. xD
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
/*What are the benefits of calculating the area of Triangle a triangle using a METHOD within the Triangle CLASS?
1) Code reuse: we eliminate the repeated code (calculating the areas of triangles x and y) in the main program.
2) Delegation of responsibilities: the person responsible for knowing how to calculate the area of
Triangle a triangle is the triangle itself. The logic for calculating the area should not be somewhere else.
 */