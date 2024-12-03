package application;

import java.util.Scanner;

public class Ex01 {

    public static void main(String []args){
        //EXERCISE 01
        Scanner sc = new Scanner (System.in);

        int number;

        System.out.print("How many numbers will you enter?");
        number = sc.nextInt();

        int[] vector = new int[number];

        for(int i=0; i < number; i++){
            System.out.print("Type number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("POSITIVE NUMBERS: ");

        for(int i = 0; i < number; i++){
            if(vector[i] > 0){
                System.out.printf("%d\n", vector[i]);
            }
        }

        System.out.println("NEGATIVE NUMBERS: ");

        for(int i = 0; i < number; i++){
            if(vector[i] < 0){
                System.out.printf("%d\n", vector[i]);
            }
        }
        sc.close();
    }
}
