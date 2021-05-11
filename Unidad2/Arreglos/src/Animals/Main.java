package Animals;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos registros desea crear?");
        int reg = scanner.nextInt();
        String[] str = new String[reg];

        for (int x = 0; x < reg; x++) {
            System.out.println("Danos el tipo de ave (Ej. Canario)");
        String tipo = scanner.next();
        System.out.println("Tu ave es tipo: " + tipo);
    }

           /* Bird[] arrayBirds = new Bird[2];
            Dog[] arrayDogs = new Dog[2];
            Animal[] arrayAnimals = new Animal[2];

            Bird Pelicano = new Bird(Color.WHITE, 15, "Pelicano");
            Dog Hachiko = new Dog(Color.ORANGE, 25, "Akita Inu");
            Animal Elefante = new Animal(Color.GRAY, 2000);

            arrayBirds[0] = Pelicano;
            arrayBirds[1] = new Bird(Color.YELLOW, 5, "Canario");
            arrayDogs[0] = Hachiko;
            arrayDogs[1] = new Dog(Color.YELLOW, 5, "Pastor Alemán");
            arrayAnimals[0] = Elefante;
            arrayAnimals[1] = new Animal(Color.RED, 1000);

            System.out.println(Pelicano.getType());
            System.out.println(arrayBirds[1].getType());

            System.out.println(Hachiko.getBreed());
            System.out.println(arrayDogs[1].getBreed());

            System.out.println(Elefante.getColor());
            System.out.println(arrayAnimals[1].getColor()); */
    }
}