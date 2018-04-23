package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt2D {

    int x;
    int y;

    public Punkt2D() {
        this(0, 0);
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void losowaniePunktow() {
        Random r = new Random();
        this.x = r.nextInt(20) - 10;
        this.y = r.nextInt(20) - 10;
    }

    @Override
    public String toString() {
        String s = "Współrzędna x: " + this.x + ", wspołrzędna y: " + this.y;
        return s;
    }
}
