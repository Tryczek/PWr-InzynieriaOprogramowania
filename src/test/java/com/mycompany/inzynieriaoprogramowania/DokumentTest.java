package com.mycompany.inzynieriaoprogramowania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class DokumentTest {

    @Test
    public void testToString() {
        System.out.println("toString");
        Dokument instance = new Dokument();
        instance.setID(1);
        instance.setPesel(123456789);
        instance.setNazwa("Dowód");
        instance.setTresc("Treść dokumentu");
        instance.setData_waznosci(new Date());

        String expResult = "1 Dowód - obywatel 123456789, wazne do " + instance.getData_waznosci() + ": Treść dokumentu";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetID() {
        System.out.println("getID");
        Dokument instance = new Dokument();
        instance.setID(1);
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 1;
        Dokument instance = new Dokument();
        instance.setID(ID);
        assertEquals(ID, instance.getID());
    }

    @Test
    public void testGetPesel() {
        System.out.println("getPesel");
        Dokument instance = new Dokument();
        instance.setPesel(123456789);
        int expResult = 123456789;
        int result = instance.getPesel();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPesel() {
        System.out.println("setPesel");
        int pesel = 123456789;
        Dokument instance = new Dokument();
        instance.setPesel(pesel);
        assertEquals(pesel, instance.getPesel());
    }

    @Test
    public void testGetNazwa() {
        System.out.println("getNazwa");
        Dokument instance = new Dokument();
        instance.setNazwa("Dowód");
        String expResult = "Dowód";
        String result = instance.getNazwa();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNazwa() {
        System.out.println("setNazwa");
        String nazwa = "Dowód";
        Dokument instance = new Dokument();
        instance.setNazwa(nazwa);
        assertEquals(nazwa, instance.getNazwa());
    }

    @Test
    public void testGetTresc() {
        System.out.println("getTresc");
        Dokument instance = new Dokument();
        instance.setTresc("Treść dokumentu");
        String expResult = "Treść dokumentu";
        String result = instance.getTresc();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTresc() {
        System.out.println("setTresc");
        String tresc = "Treść dokumentu";
        Dokument instance = new Dokument();
        instance.setTresc(tresc);
        assertEquals(tresc, instance.getTresc());
    }

    @Test
    public void testGetData_waznosci() {
        System.out.println("getData_waznosci");
        Dokument instance = new Dokument();
        Date expResult = new Date();
        instance.setData_waznosci(expResult);
        Date result = instance.getData_waznosci();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetData_waznosci() {
        System.out.println("setData_waznosci");
        Date data_waznosci = new Date();
        Dokument instance = new Dokument();
        instance.setData_waznosci(data_waznosci);
        assertEquals(data_waznosci, instance.getData_waznosci());
    }
}
