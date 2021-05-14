package Geo_Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int option = 0;
        String[] name = new String[0];
        double[] surface = new double[0];
        String[] language = new String[0];
        String[] president = new String[0];
        String[] currency = new String[0];

        Scanner scanner = new Scanner(System.in);

        while (option != 4) {
        System.out.println("Qué desea hacer? \n 1) Crear una zona geográfica \n 2) Crear una provincia \n 3) Mostrar datos \n 4) Salir");
        option = scanner.nextInt();

        switch (option) {
            case 1: {
                System.out.println("Cuántas zonas desea crear?");
                int amount = scanner.nextInt();

                name = new String[amount];
                surface = new double[amount];

                for (int x=0; x<amount; x++) {
                    System.out.println("Dame el nombre de la zona:");
                    String nombre =  scanner.next();
                    System.out.println("Dame la superficie de la zona: (en kilómetros)");
                    double superficie = scanner.nextDouble();
                    System.out.println("----->");

                    name[x] = nombre;
                    surface[x] = superficie;
                }
                break;
            }
            case 2: {
                System.out.println("Cuántas provincias desea crear?");
                int amount = scanner.nextInt();

                language = new String[amount];
                president = new String[amount];
                currency = new String[amount];

                for (int x=0; x<amount; x++) {
                    System.out.println("Dame el idioma que se habla en esa provincia:");
                    String idioma = scanner.next();
                    System.out.println("Dame el nombre del presidente de esa provincia:");
                    String presidente = scanner.next();
                    System.out.println("Dame el nombre de la moneda en esa provincia:");
                    String moneda = scanner.next();
                    System.out.println("----->");

                    language[x] = idioma;
                    president[x] = presidente;
                    currency[x] = moneda;
                }
                break;
            }
            case 3: {
                System.out.println("-----o-----");
                System.out.println("Datos de las zonas:");
                printZone(name,surface);
                System.out.println("Datos de las provincias:");
                printProvince(language,president,currency);
                System.out.println("-----o-----");
                break;
            }
            case 4: {
                System.out.println("El programa ha sido terminado.");
                break;
            }
            default: {
                System.out.println("⚠ ERROR! ⚠");
            }
        }
        }

        }
        public static void printZone(String[] name, double[] surface){
        for(int x=0; x<name.length; x++){
            System.out.println("<<<< Zona >>>>");
            System.out.println("Su nombre es: " + name[x] + ".");
            System.out.println("Su superficie es de: " + surface[x] + "km.");
        }
    }
    public static void printProvince(String[] language, String[] president, String[] currency){
        for(int x=0; x< language.length; x++){
            System.out.println("<<<< Provincia >>>>");
            System.out.println("Su idioma es: " + language[x] + ".");
            System.out.println("Su presidente se llama: " + president[x] + ".");
            System.out.println("Su moneda es: " + currency[x] + ".");
        }
    }
    }
