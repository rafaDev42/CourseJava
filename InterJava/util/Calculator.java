package util;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

    //Antigo...
    /*If we delete a static method inside another static method the program will not work correctly
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    } Antigo...
    //static
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }*/

}
