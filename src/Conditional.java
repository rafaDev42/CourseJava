import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Estrutura condicional composta int hora;
         *
         * System.out.println("Que horas são?"); hora = sc.nextInt();
         *
         * if(hora <= 12) { System.out.println("Bom dia!");
         * } else {
         * System.out.println("Boa tarde!");
         * }
         */

        // Estrutura condicional encadeada
        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        /*Estrutura condicional ternária
        (condição) ? valor_se_verdadeiro : valor_se_falso; */

        sc.close();
    }
}