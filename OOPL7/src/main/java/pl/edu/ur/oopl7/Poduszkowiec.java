package pl.edu.ur.oopl7;

public class Poduszkowiec implements Naziemne, Wodne {

    public Poduszkowiec() {
    }

    @Override
    public String jedzie() {
        String s ="jedzie";
        return s;
    }

    @Override
    public String plynie() {
        String s ="plynie";
        return s;
    }

    public static void main(String[] args) {
        Poduszkowiec p = new Poduszkowiec();
        System.out.println("Poduszkowiec zarowno " + p.jedzie() + " jak i " + p.plynie());
    }

}
