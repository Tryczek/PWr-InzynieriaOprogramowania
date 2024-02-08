package com.mycompany.inzynieriaoprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class ZgloszenieTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        Zgloszenie instance = new Zgloszenie();
        instance.setID(1);
        instance.setPesel(123456789);
        instance.setTresc("Testowe zgłoszenie");
        ArrayList<String> dane_dotyczace = new ArrayList<>();
        dane_dotyczace.add("Jan");
        dane_dotyczace.add("Kowalski");
        dane_dotyczace.add("987654321");
        dane_dotyczace.add("M");
        instance.setDane_dotyczace(dane_dotyczace);
        instance.setRozpatrzone(false);

        String expResult = "1 - obywatel 123456789 - zmiana danych: imie > Jan, nazwisko > Kowalski, PESEL > 987654321, plec > M, - rozpatrzone: false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        Zgloszenie instance = new Zgloszenie();
        instance.setID(1);
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 1;
        Zgloszenie instance = new Zgloszenie();
        instance.setID(ID);
        assertEquals(ID, instance.getID());
    }

    @Test
    public void testGetPesel() {
        System.out.println("getPesel");
        Zgloszenie instance = new Zgloszenie();
        instance.setPesel(123456789);
        int expResult = 123456789;
        int result = instance.getPesel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPesel() {
        System.out.println("setPesel");
        int pesel = 123456789;
        Zgloszenie instance = new Zgloszenie();
        instance.setPesel(pesel);
        assertEquals(pesel, instance.getPesel());
    }

    @Test
    public void testGetTresc() {
        System.out.println("getTresc");
        Zgloszenie instance = new Zgloszenie();
        instance.setTresc("Testowe zgłoszenie");
        String expResult = "Testowe zgłoszenie";
        String result = instance.getTresc();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTresc() {
        System.out.println("setTresc");
        String tresc = "Testowe zgłoszenie";
        Zgloszenie instance = new Zgloszenie();
        instance.setTresc(tresc);
        assertEquals(tresc, instance.getTresc());
    }

    @Test
    public void testGetDane_dotyczace() {
        System.out.println("getDane_dotyczace");
        Zgloszenie instance = new Zgloszenie();
        ArrayList<String> dane_dotyczace = new ArrayList<>();
        dane_dotyczace.add("Jan");
        dane_dotyczace.add("Kowalski");
        dane_dotyczace.add("987654321");
        dane_dotyczace.add("M");
        instance.setDane_dotyczace(dane_dotyczace);
        ArrayList<String> expResult = dane_dotyczace;
        ArrayList<String> result = instance.getDane_dotyczace();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDane_dotyczace() {
        System.out.println("setDane_dotyczace");
        ArrayList<String> dane_dotyczace = new ArrayList<>();
        dane_dotyczace.add("Jan");
        dane_dotyczace.add("Kowalski");
        dane_dotyczace.add("987654321");
        dane_dotyczace.add("M");
        Zgloszenie instance = new Zgloszenie();
        instance.setDane_dotyczace(dane_dotyczace);
        assertEquals(dane_dotyczace, instance.getDane_dotyczace());
    }

    @Test
    public void testGetRozpatrzone() {
        System.out.println("getRozpatrzone");
        Zgloszenie instance = new Zgloszenie();
        instance.setRozpatrzone(true);
        boolean expResult = true;
        boolean result = instance.getRozpatrzone();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRozpatrzone() {
        System.out.println("setRozpatrzone");
        boolean rozpatrzone = true;
        Zgloszenie instance = new Zgloszenie();
        instance.setRozpatrzone(rozpatrzone);
        assertEquals(rozpatrzone, instance.getRozpatrzone());
    }

    
}
