package pl.edu.ur.oopl7;

public class Student extends Osoba {

    protected int nr_indeksu;
    protected String typ_studiow;
    protected String kierunek;
    protected int rok_studiow;

    
    public Student() {
        this("", "", "", "", 0, "", "", 0);
    }

    public Student(String imie, String nazwisko, String data_urodzenia, String płeć, int nr_indeksu, String typ_studiow, String kierunek, int rok_studiow) {
        super(imie, nazwisko, data_urodzenia, płeć);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }

    @Override
    public void pokazDane() {
        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", data urodzenia: " + data_urodzenia + ", płeć: " + płeć + ", nr indeksu: " + nr_indeksu + ", typ studiow: " + typ_studiow + ", kierunek: " + kierunek + ", rok studiow: " + rok_studiow);
    }

}
