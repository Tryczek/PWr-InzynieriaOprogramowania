package com.mycompany.inzynieriaoprogramowania;

import java.util.ArrayList;
import java.util.Date;

public class Obywatel {

    protected String imie;
    protected String nazwisko;
    protected int pesel;
    protected String plec;
    protected ArrayList<Dokument> dokumenty = new ArrayList<Dokument>();
    protected ArrayList<Zgloszenie> zgloszenia = new ArrayList<Zgloszenie>();

    public String toString() {
        return pesel + ": " + (imie != null ? imie : "Jan") + " " + (nazwisko != null ? nazwisko : "Kowalski") + ", " + (plec != null ? plec : "");
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return this.pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return this.plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public ArrayList<Dokument> getDokumenty() {
        return dokumenty;
    }

    public Dokument dodajDokument(int ID, String nazwa, String tresc, Date data_waznosci) {
        if (Aplikacja.szukajDokument(ID) != null) return null;
        Dokument n = new Dokument();
        n.setID(ID);
        n.setPesel(this.getPesel());
        n.setNazwa(nazwa);
        n.setTresc(tresc);
        n.setData_waznosci(data_waznosci);
        dokumenty.add(n);
        Aplikacja.dokumenty.add(n);
        return n;
    }
}
