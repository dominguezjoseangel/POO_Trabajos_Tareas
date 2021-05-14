package Geo_Area;
import java.awt.*;

public class Zone {
    private String name;
    private double surface;

    public Zone (String name, double surface){
        this.name = name;
        this.surface = surface;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getSurface() {
        return surface;
    }
}
