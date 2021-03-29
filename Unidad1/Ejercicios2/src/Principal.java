import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Funciones ----");

        // Recoge las cantidades
        System.out.println("Introduce la cantidad en pesos mexicanos que desee: (Ej. 1,15/1,50/5,25...)");
        double moneda= scanner.nextDouble();
        System.out.println("Introduce el valor actual del dolar: (Ej. 19,5/20,4/25,2...");
        double dolar= scanner.nextDouble();
        // Envia los datos recogidos
        double datos = funcion1(moneda,dolar);
        System.out.println("$" + moneda + " pesos mexicanos, equivalen a $" + datos + " dolares.");
    }

    // Primera Funcion (Recibe los resultados y envia una respuesta)
    public static double funcion1(double x, double y) {
        double resultado = x * y;
        return resultado;
    }

    // Segunda Funcion (Recibe un resultado pero no envia respuesta)
    public static void funcion2(int x) {
        System.out.println("Me mandaste los pesos pero no el valor del dolar, no puedo enviar nada...");
    }

    // Tercera Funcion (No recibe resultados pero envia una respuesta)
    public static boolean funcion3() {
        return true;
    }

    // Cuarta Funcion (No recibe y ni envia resultados)
    public static void funcion4() {
        //No he recibido nada y no tengo nada que enviar.
    }
}
