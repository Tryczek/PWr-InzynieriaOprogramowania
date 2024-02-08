package com.mycompany.inzynieriaoprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class Zgloszenie_o_dokumentyTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        Zgloszenie_o_dokumenty instance = new Zgloszenie_o_dokumenty();
        instance.setID(1);
        instance.setPesel(123456789);
        instance.setRozpatrzone(false);

        Dokument dokument1 = new Dokument();
        dokument1.setID(1);
        Dokument dokument2 = new Dokument();
        dokument2.setID(2);

        ArrayList<Dokument> dokumenty = new ArrayList<>();
        dokumenty.add(dokument1);
        dokumenty.add(dokument2);
        instance.setDokumenty(dokumenty);

        String expResult = "1 - obywatel 123456789 - zmiana dokumentow: 1 2 - rozpatrzone: false";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDokumenty() {
        System.out.println("getDokumenty");
        Zgloszenie_o_dokumenty instance = new Zgloszenie_o_dokumenty();
        Dokument dokument1 = new Dokument();
        dokument1.setID(1);
        Dokument dokument2 = new Dokument();
        dokument2.setID(2);

        ArrayList<Dokument> dokumenty = new ArrayList<>();
        dokumenty.add(dokument1);
        dokumenty.add(dokument2);
        instance.setDokumenty(dokumenty);

        ArrayList<Dokument> expResult = dokumenty;
        ArrayList<Dokument> result = instance.getDokumenty();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDokumenty() {
        System.out.println("setDokumenty");
        ArrayList<Dokument> dokumenty = new ArrayList<>();
        Dokument dokument1 = new Dokument();
        dokument1.setID(1);
        Dokument dokument2 = new Dokument();
        dokument2.setID(2);
        dokumenty.add(dokument1);
        dokumenty.add(dokument2);

        Zgloszenie_o_dokumenty instance = new Zgloszenie_o_dokumenty();
        instance.setDokumenty(dokumenty);

        assertEquals(dokumenty, instance.getDokumenty());
    }
}
