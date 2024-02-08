package com.mycompany.inzynieriaoprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObywatelTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        Obywatel instance = new Obywatel();
        String expResult = "0: Jan Kowalski, ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetImie() {
        System.out.println("getImie");
        Obywatel instance = new Obywatel();
        instance.setImie("Jan");  // Set the expected value for the test
        String expResult = "Jan";
        String result = instance.getImie();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetImie() {
        System.out.println("setImie");
        String imie = "";
        Obywatel instance = new Obywatel();
        instance.setImie(imie);
        assertEquals(imie, instance.getImie());
    }

    @Test
    public void testGetNazwisko() {
        System.out.println("getNazwisko");
        Obywatel instance = new Obywatel();
        instance.setNazwisko("Kowalski");  // Set the expected value for the test
        String expResult = "Kowalski";
        String result = instance.getNazwisko();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNazwisko() {
        System.out.println("setNazwisko");
        String nazwisko = "";
        Obywatel instance = new Obywatel();
        instance.setNazwisko(nazwisko);
        assertEquals(nazwisko, instance.getNazwisko());
    }

    @Test
    public void testGetPesel() {
        System.out.println("getPesel");
        Obywatel instance = new Obywatel();
        int expResult = 0;
        int result = instance.getPesel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPesel() {
        System.out.println("setPesel");
        int pesel = 123456789;
        Obywatel instance = new Obywatel();
        instance.setPesel(pesel);
        assertEquals(pesel, instance.getPesel());
    }

    @Test
    public void testGetPlec() {
        System.out.println("getPlec");
        Obywatel instance = new Obywatel();
        instance.setPlec("");  // Set the expected value for the test
        String expResult = "";
        String result = instance.getPlec();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPlec() {
        System.out.println("setPlec");
        String plec = "M";
        Obywatel instance = new Obywatel();
        instance.setPlec(plec);
        assertEquals(plec, instance.getPlec());
    }

    @Test
    public void testDodajDokument() {
        System.out.println("dodajDokument");
        int ID = 1;
        String nazwa = "Dowód";
        String tresc = "Treść dokumentu";
        Obywatel instance = new Obywatel();
        Dokument expResult = new Dokument();
        expResult.setID(ID);
        expResult.setPesel(instance.getPesel());
        expResult.setNazwa(nazwa);
        expResult.setTresc(tresc);

        Dokument result = instance.dodajDokument(ID, nazwa, tresc, null);

        assertEquals(expResult.toString(), result.toString());
    }
}
