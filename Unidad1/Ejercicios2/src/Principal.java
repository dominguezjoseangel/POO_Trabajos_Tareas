import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Funciones ----");

        // Recoge las cantidades
        System.out.println("Introduce la cantidad de un producto en especifico que desea comprar:");
        int cantidad= scanner.nextInt();

        System.out.println("Introduce el precio unitario del producto: (Ej. 19,4/10,25/25,0...)");
        double valor= scanner.nextDouble();

        System.out.println("¿Cual es el nombre de la empresa en la que trabaja?");
        String nombre = scanner.next();

        System.out.println("¿Es usted el jefe? (Y/N)");
        String jefe = scanner.next();

        // Envia los datos recogidos
        double datos1 = subtotal(cantidad,valor);
        double datos2 = totalidad(datos1);
        String datos3 = totalidad(nombre,jefe);

        // Textos
        System.out.println("------ Ticket ------");
        System.out.println("La cantidad de " + cantidad + " productos, por el valor unitario de $" + valor + " pesos, da un subtotal de $" + datos1 + " pesos.");
        System.out.println("El valor del IVA para el subtotal es de $" + datos2);
        double total = datos1 + datos2;
        System.out.println("El total comprado es de $" + total);
        System.out.println("La" + datos3 + ", gasto dicha cantidad en la compra de dichos productos.");
        System.out.println("--------------------");

    }

        // Primera Funcion (Recibe los resultados y envia el subtotal)
        public static double subtotal(int x, double y) {
            double resultado = x * y;
            return resultado;
        }

        // Segunda Funcion (Recibe un resultado subtotal y devuelve el valor IVA)
        public static double totalidad(double x) {
            double resultado = x * .16;
            return resultado;
        }

        // Devuelve Cargo de Compra (Recibe datos de empresa y el jefe para devolver el cargo de compra)
        public static String totalidad(String x,String y) {
            String resultado;
            if (y.equalsIgnoreCase("Y")) {
                resultado = (" empresa " + x + " a cargo de usted");
            } else {
                resultado = (" empresa " + x + " a cargo de quien corresponda");
            }
            return resultado;
        }

        //Nada de nada
        public static void nada() {
            // El programa ya fue ejecutado con exito!
        }
}
