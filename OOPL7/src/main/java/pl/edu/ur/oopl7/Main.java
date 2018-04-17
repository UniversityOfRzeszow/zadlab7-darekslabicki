package pl.edu.ur.oopl7;

public class Main {

    public static void main(String[] args) {
        Osoba os1 = new Osoba();
        Osoba os2 = new Osoba("Jan", "Kowalski", "13.02.1998r", "mezczyzna");
        Student st1 = new Student();
        Student st2 = new Student("Jan", "Kowalski", "13.02.1998r", "mezczyzna", 123124, "abcd", "adca", 3);
       
        os1.pokazDane();
        os2.pokazDane();
        st1.pokazDane();
        st2.pokazDane();
        
    }

}
