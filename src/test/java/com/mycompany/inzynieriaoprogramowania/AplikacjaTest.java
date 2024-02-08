package com.mycompany.inzynieriaoprogramowania;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;

public class AplikacjaTest {

    public AplikacjaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        Aplikacja.aplikacjaClear();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testDodajObywatela() {
        System.out.println("dodajObywatela");
        int PESEL = 123456789;
        String imie = "Jan";
        String nazwisko = "Kowalski";
        String plec = "M";

        Obywatel expResult = new Obywatel();
        expResult.setPesel(PESEL);
        expResult.setImie(imie);
        expResult.setNazwisko(nazwisko);
        expResult.setPlec(plec);

        Obywatel result = Aplikacja.dodajObywatela(PESEL, imie, nazwisko, plec);

        assertNotNull(result);
        assertEquals(expResult.getPesel(), result.getPesel());
        assertEquals(expResult.getImie(), result.getImie());
        assertEquals(expResult.getNazwisko(), result.getNazwisko());
        assertEquals(expResult.getPlec(), result.getPlec());
    }


    @Test
    public void testModelZgloszen() {
        System.out.println("modelZgloszen");
        Aplikacja.dodajObywatela(123456789, "Jan", "Kowalski", "M");
        ArrayList<String> zmiany = new ArrayList<>();
        zmiany.add("");
        zmiany.add("Iksinski");
        zmiany.add("2");
        zmiany.add("");
        Aplikacja.dodajZgloszenie(123456789, "Testowe zgloszenie", false, null, zmiany);

        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("0 - obywatel 123456789 - zmiana danych: nazwisko > Iksinski, PESEL > 2, - rozpatrzone: false");

        ArrayList<String> result = Aplikacja.modelZgloszen();

        assertNotNull(result);
        assertEquals(expResult, result);
    }
}
