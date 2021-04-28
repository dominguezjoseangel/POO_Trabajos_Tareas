public class Main {
    public static void main(String[] args) {
        //Distancia de la tierra - (En Kilometros)
        //Velocidad - (En Km/H)

        Asteroid Astraea = new Asteroid("astraea","solid",385064919181.8,72000);
        Asteroid Ceres = new Asteroid("ceres","solid",460000000,64375.2);
        Asteroid Palas = new Asteroid("palas","solid",400000000,63540);

        // Astraea
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

        // Astraea NEW INFO
        System.out.println("Astraea's NEW Info:");
        System.out.println("Name: " + Astraea.getName());
        System.out.println("Composition: " + Astraea.getComposition());
        System.out.println("Distance of earth: " + Astraea.getDistanceofEarth());
        System.out.println("Speed: " + Astraea.getSpeed());
        System.out.println("----------o----------");

    }
}
