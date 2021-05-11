package Animals;

import java.awt.*;

public class Bird extends Animal{
    private String type;

    public Bird (Color color, double weight, String type){
        super(color,weight);
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void fly(){
        System.out.println("Está volando...");
    }
}