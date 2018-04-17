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
public class Wykladowca extends Osoba {
    protected String wykladany_przedmiot;
    protected String stopien;
    
    @Override
    public void pokazDane() {
        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", data urodzenia: " + data_urodzenia + ", płeć: " + płeć + " wykladany przedmiot: " + wykladany_przedmiot + ", stopien naukowy:" + stopien);
    }
    
}
