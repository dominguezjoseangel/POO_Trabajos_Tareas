package Animals;
import java.awt.*;

public class Main {
    public static void main(String [] args){
        Animal elephant = new Animal (Color.GRAY, 2000);
        Bird pelican = new Bird (Color.WHITE,15, "Pelicano");
        Dog hachiko = new Dog (Color.ORANGE, 25, "Akita Inu");

        // Animal
        System.out.println("----o----");
        System.out.println("Datos de tu animal:");
        System.out.println("Color:" + elephant.getColor());
        System.out.println("Peso:" + elephant.getWeight());
        elephant.eat();
        elephant.move();

        // Ave
        System.out.println("----o----");
        System.out.println("Datos de tu ave:");
        System.out.println("Color: " + pelican.getColor());
        System.out.println("Peso: " + pelican.getWeight());
        System.out.println("Tipo: " + pelican.getType());
        pelican.fly();

        // Perro
        System.out.println("----o----");
        System.out.println("Datos de tu perro:");
        System.out.println("Color: " + hachiko.getColor());
        System.out.println("Peso: " + hachiko.getWeight());
        System.out.println("Raza: " + hachiko.getBreed());
        hachiko.bark();
    }
}
