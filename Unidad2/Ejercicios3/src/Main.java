import java.util.Scanner;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
        Asteroid Astraea = new Asteroid("astraea","solid",385064919181.8,72000);
        Asteroid Ceres = new Asteroid("ceres","solid",460000000,64375.2);
        Asteroid Palas = new Asteroid("palas","solid",400000000,63540);

        Star Sun = new Star("the sun","solid",385064919181.8,72000);
        Star Polaris = new Star("ceres","solid",460000000,64375.2);
        Star Sirius = new Star("palas","solid",400000000,63540);

            System.out.println("Astraea's Info:");
            System.out.println("Name: " + Astraea.getName());
            System.out.println("Composition: " + Astraea.getComposition());
            System.out.println("Distance of earth: " + Astraea.getDistanceofEarth());
            System.out.println("Speed: " + Astraea.getSpeed());
            System.out.println("----------o----------");

            // Ceres
            System.out.println("Ceres' Info:");
            System.out.println("Name: " + Ceres.getName());
            System.out.println("Composition: " + Ceres.getComposition());
            System.out.println("Distance of earth: " + Ceres.getDistanceofEarth());
            System.out.println("Speed: " + Ceres.getSpeed());
            System.out.println("----------o----------");

            // Palas
            System.out.println("Palas' Info:");
            System.out.println("Name: " + Palas.getName());
            System.out.println("Composition: " + Palas.getComposition());
            System.out.println("Distance of earth: " + Palas.getDistanceofEarth());
            System.out.println("Speed: " + Palas.getSpeed());
            System.out.println("----------o----------");

            // Set Changes Example =>
            Astraea.setName("Astraea Asteroid");
            Astraea.setComposition("liquid");
            Astraea.setDistanceofEarth(1);
            Astraea.setSpeed(2);

            */

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        while(option != 4) {
            System.out.println("Elija la opción de lo que desea crear: \n 1) Una estrella \n 2) Un asteroide \n 3) Un planeta \n 4) Salir");
            option=scanner.nextInt();

            switch (option) {
                case 1: {
                    // Star
                    System.out.println("Introduce el diámetro (en kilómetros):");
                    double diametro = scanner.nextDouble();

                    System.out.println("Introduce el tipo de estrella: \n 1) Enana blanca \n 2) Enana roja");
                    int tipo = scanner.nextInt();
                    String t = "";
                    if (tipo==1) {t = "Enana blanca";}
                    else if (tipo==2) {t = "Enana roja";}
                    else {t= "Vacío";}

                    System.out.println("Introduce el color: \n 1) Azul \n 2) Celeste \n 3) Blanca \n 4) Amarilla \n 5) Naranja \n 6) Roja");
                    int color = scanner.nextInt();
                    Color c = Color.BLACK;
                    if (color==1) {c = Color.BLUE;}
                    else if (color==2) {c = Color.CYAN;}
                    else if (color==3) {c = Color.WHITE;}
                    else if (color==4) {c = Color.YELLOW;}
                    else if (color==5) {c = Color.ORANGE;}
                    else if (color==6) {c = Color.RED;}
                    else {c= Color.BLACK;}

                    Star newstar = new Star(diametro,t,c);
                    System.out.println("----------o----------");
                    System.out.println("Tu estrella contiene los siguientes datos: \n Diámetro: " + newstar.getDiameter() + " km. \n Tipo: " + newstar.getType() + " \n Color: " + newstar.getColor());
                    System.out.println("----------o----------");
                    break;
                }
                case 2: {
                    System.out.println("Introduce el nombre de tu asteroide:");
                    String nombre = scanner.next();

                    System.out.println("Introduce la composición de tu asteroide: \n 1) Gas \n 2) Sólido \n 3) Líquido");
                    int composicion = scanner.nextInt();
                    String cm = "";
                    if (composicion==1) {cm = "Gas";}
                    else if (composicion==2) {cm = "Sólido";}
                    else if (composicion==3) {cm= "Líquido";}
                    else {cm= "Vacío";}

                    System.out.println("Introduce la distancia a la que está de lejanía a la tierra (en kilómetros):");
                    double distancia = scanner.nextDouble();

                    System.out.println("Introduce la velocidad a la que viaja el asteroide (en km/h):");
                    double velocidad = scanner.nextDouble();

                    Asteroid newasteroid = new Asteroid(nombre,cm,distancia,velocidad);
                    System.out.println("----------o----------");
                    System.out.println("Tu asteroide contiene los siguientes datos: \n Nombre: " + newasteroid.getName() + " \n Composición: " + newasteroid.getComposition() + " \n Distancia de la Tierra: " + newasteroid.getDistanceofEarth() + " km. \n Velocidad: " + newasteroid.getSpeed() + " km/h.");
                    System.out.println("----------o----------");
                    break;
                }
                case 3: {
                    System.out.println("Introduce el nombre de tu planeta:");
                    String nombre = scanner.next();

                    System.out.println("Introduce la distancia de tu planeta a su Sol (en kilómetros):");
                    double distancia_del_sol = scanner.nextDouble();

                    System.out.println("Introduce la composición de tu planeta: \n 1) Gas \n 2) Sólido \n 3) Líquido");
                    int composicion = scanner.nextInt();
                    String cm = "";
                    if (composicion==1) {cm = "Gas";}
                    else if (composicion==2) {cm = "Sólido";}
                    else if (composicion==3) {cm= "Líquido";}
                    else {cm= "Vacío";}

                    System.out.println("Introduce los dias que tarda tu planeta en dar la vuelta alrededor de su sol (días en formato 24hrs = 1 día):");
                    double dias_orbita = scanner.nextDouble();

                    System.out.println("Introduce la masa de tu planeta (en kilogramos)");
                    double masa = scanner.nextDouble();

                    Planet newplanet = new Planet(nombre,distancia_del_sol,cm,dias_orbita,masa);
                    System.out.println("----------o----------");
                    System.out.println("Tu planeta contiene los siguientes datos: \n Nombre: " + newplanet.getName() + " \n Composición: " + newplanet.getComposition() + " \n Días para dar una vuelta al sol: " + newplanet.getOrbit_days() + " días. \n Masa: " + newplanet.getMass() + " kg.");
                    System.out.println("----------o----------");
                    break;
                }
                case 4: {
                    System.out.println("Adiós o/");
                    break;
                }
                default: {
                    System.out.println("⚠ Opción no válida ⚠");
                    System.out.println("----------o----------");
                }
            }
        }
            System.out.println("Gracias por haber utilizado el programa.");

    }
}