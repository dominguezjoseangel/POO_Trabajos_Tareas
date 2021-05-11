package Animals;

import java.awt.*;

public class Dog extends Animal{
    private String breed;

    public Dog (Color color, double weight, String breed) {
        super(color,weight);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark(){
        System.out.println("Está ladrando...");
    }
}