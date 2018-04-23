package pl.edu.ur.oopl7;

public class Main2 {

    public static void main(String[] args) {
        Punkt2D p2D = new Punkt2D();
        p2D.losowaniePunktow();
        System.out.println(p2D.toString());
        Punkt3D p3D = new Punkt3D();
        p3D.losowaniePunktow();
        System.out.println(p3D.toString());
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for (int i = 0; i < 100; i++) {
            array2D[i] = new Punkt2D();
            array2D[i].losowaniePunktow();
            array3D[i] = new Punkt3D();
            array3D[i].losowaniePunktow();
        }
        int x = 1;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i >= j) {
                } else {
                    if (array2D[i].x == array2D[j].x && array2D[i].y == array2D[j].y) {
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println(x + " powtorzenie w tablicy array3D dla " + i + " i " + j + " elementów tablicy:");
                        System.out.println("\n" + i + " element tablicy " + array2D[i].toString());
                        System.out.println(j + " element tablicy " + array3D[j].toString());
                        x++;
                    }
                }
            }
        }
        x = 1;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i >= j) {
                } else {
                    if (array3D[i].x == array3D[j].x && array3D[i].y == array3D[j].y) {
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println(x + " powtorzenie w tablicy array3D dla " + i + " i " + j + " elementów tablicy:");
                        System.out.println("\n" + i + " element tablicy " + array3D[i].toString());
                        System.out.println(j + " element tablicy " + array3D[j].toString());
                        x++;
                    }
                }
            }
        }
    }
}
