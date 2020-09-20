package ar.com.ada.online.instance;

public class Main {

    public static void main(String[] args) {
        XWingStarfighter ship1 = new XWingStarfighter()
        ship1.model = "T-75";
        ship1.maxAcceleration = 22;
        ship1.shootLaser();

        XWingStarfighter ship2 = new XWingStarfighter();
        ship2.model = "T-65";
        ship2.maxAcceleration = 16;
        ship2.shootLaser();

        XWingStarfighter shipRef1 = ship1; // esta variable toma la referencia en memoria de la instancia creada en ship1
        shipRef1.model = "T-22"; // tecnicamente se le esta cambiando el valor de model a ship1
        ship1.shootLaser();

    }
}
