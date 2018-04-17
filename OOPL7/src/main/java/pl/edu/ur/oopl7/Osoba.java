/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected String data_urodzenia;
    protected String płeć;
    
    public Osoba(){
        this("","","","");
    }
    public Osoba(String imie,String nazwisko,String data_urodzenia,String płeć){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.data_urodzenia=data_urodzenia;
        this.płeć=płeć;
             
    }
    public void pokazDane() {
        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", data urodzenia: " + data_urodzenia + ", płeć: " + płeć);
    }
}
