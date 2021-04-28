public class Asteroid {
    private String name;
    private String composition;
    public double distance_of_earth;
    protected double speed;

    public Asteroid(String n, String c, double d, double s){
        this.name=n;
        this.composition=c;
        this.distance_of_earth=d;
        this.speed=s;
    }

    // Set Name
    public void setName(String newName) {
        this.name = newName;
    }
    // Get Name
    public String getName() {
        return this.name;
    }

    // Set Composition
    public void setComposition(String newComposition) {
        this.composition = newComposition;
    }
    // Get Composition
    public String getComposition() {
        return this.composition;
    }

    // Set DoE
    public void setDistanceofEarth(double newDistanceofEarth) {
        this.distance_of_earth = newDistanceofEarth;
    }
    // Get DoE
    public double getDistanceofEarth() {
        return this.distance_of_earth;
    }

    // Set Speed
    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }
    // Get Speed
    public double getSpeed() {
        return this.speed;
    }

}
