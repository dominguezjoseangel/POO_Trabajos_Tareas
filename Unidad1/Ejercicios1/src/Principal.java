import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {

        //Primera interrogante - -
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Edad del Usuario ----");
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        if (edad >= 18 ) {
            System.out.println("Eres mayor de edad y has vivido un total de " + edad * 365 + " dias.");
            System.out.println("--------------------------------------------------------------");
        } else if (edad <= 12) {
            System.out.println("Eres un niño y has vivido un total de " + edad * 365 + " dias.");
            System.out.println("--------------------------------------------------------------");
        } else {
            System.out.println("Eres un joven/adolescente y has vivido un total de " + edad * 365 + " dias.");
            System.out.println("--------------------------------------------------------------");
        }

        //Tablas de Multiplicar - -
        System.out.println("Introduce un número del 1 al 10 para ver las tablas de multiplicar:");
        int value = scanner.nextInt();

        if (value > 10) {
            System.out.println("Ouch! Parece ser que ese numero es mayor de 10, reinicia e intenta con uno menor.");
        } else if (value < 1) {
            System.out.println("Ouch! Parece ser que ese numero es muy bajo, reinicia e intenta con uno mayor.");
        } else {
            System.out.println("---- Tablas de Multiplicar del "+ value + " ----");
            for (int a=0 ; a < 10 ; a++) {
                int loop = a+1;
                System.out.println(value + " * " + loop + " = " + loop*value);
            }
        }
    }
}
