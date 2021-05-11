package Animals;
import java.awt.*;
import java.sql.SQLOutput;

public class Animal {
    private Color color;
    private double weight;

    public Animal (Color color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println("Se encuentra comiendo...");
    }

    public void move() {
        System.out.println("Se está moviendo...");
    }
}