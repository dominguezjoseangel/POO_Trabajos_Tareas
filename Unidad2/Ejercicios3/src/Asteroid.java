public class Asteroid {
    private String name;
    private String composition;
    public double distance_of_earth;
    protected double speed;

    public Asteroid(String name, String composition, double distance_of_earth, double speed){
        this.name=name;
        this.composition=composition;
        this.distance_of_earth=distance_of_earth;
        this.speed=speed;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setComposition(String newComposition) {
        this.composition = newComposition;
    }

    public String getComposition() {
        return this.composition;
    }

    public void setDistanceofEarth(double newDistanceofEarth) {
        this.distance_of_earth = newDistanceofEarth;
    }

    public double getDistanceofEarth() {
        return this.distance_of_earth;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    public double getSpeed() {
        return this.speed;
    }

}