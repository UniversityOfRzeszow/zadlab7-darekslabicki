package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt3D extends Punkt2D {

    int z;

    public Punkt3D() {
        this(0, 0, 0);
    }

    public Punkt3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public void losowaniePunktow() {
        Random r = new Random();
        this.x = r.nextInt(20) - 10;
        this.y = r.nextInt(20) - 10;
        this.z = r.nextInt(20) - 10;
    }

    @Override
    public String toString() {
        String s = "Współrzędna x: " + this.x + ", wspołrzędna y: " + this.y + ", współrzędna z: " + this.z;
        return s;
    }
}
