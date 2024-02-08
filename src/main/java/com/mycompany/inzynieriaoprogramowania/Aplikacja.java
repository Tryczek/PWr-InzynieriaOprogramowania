package com.mycompany.inzynieriaoprogramowania;

import java.util.ArrayList;

public class Aplikacja {

	static protected ArrayList<Obywatel> obywatele = new ArrayList<Obywatel>();
	static protected ArrayList<Dokument> dokumenty = new ArrayList<Dokument>();
	static protected ArrayList<Zgloszenie> zgloszenia = new ArrayList<Zgloszenie>();

	public ArrayList<Obywatel> getObywatele() {
		return obywatele;
	}
        
        public static void aplikacjaClear() {
            obywatele.clear();
            dokumenty.clear();
            zgloszenia.clear();
}


	public void setObywatele(ArrayList<Obywatel> n_obywatele) {
		obywatele = n_obywatele;
	}

	public ArrayList<Dokument> getDokumenty() {
		return dokumenty;
	}

	public void setDokumenty(ArrayList<Dokument> n_dokumenty) {
		dokumenty = n_dokumenty;
	}

	public ArrayList<Zgloszenie> getZgloszenia() {
		return zgloszenia;
	}

	public void setZgloszenia(ArrayList<Zgloszenie> n_zgloszenia) {
		zgloszenia = n_zgloszenia;
	}

	public static Zgloszenie dodajZgloszenie(int pesel, String tresc, boolean czy_dokumenty, ArrayList<Dokument> dokumenty, ArrayList<String> dane_dotyczace) {
		Zgloszenie n;
		if(czy_dokumenty) {
			Zgloszenie_o_dokumenty nn = new Zgloszenie_o_dokumenty();
			nn.setDokumenty(dokumenty);
			n = nn;
		}
		else{
			n = new Zgloszenie();
			n.setDane_dotyczace(dane_dotyczace);
		}
		n.setPesel(pesel);
		n.setTresc(tresc);
		n.setID(Zgloszenie.zgloszenie_number);
		Zgloszenie.zgloszenie_number++;
		n.setRozpatrzone(false);
		zgloszenia.add(n);
		return n;
	}

	static public Obywatel szukajObywatela(int PESEL) {
		for(Obywatel n : obywatele) {
			if (n.getPesel() == PESEL) return n;
		}
		return null;
	}

	static public Dokument szukajDokument(int ID) {
		for(Dokument n : dokumenty) {
			if (n.getID() == ID) return n;
		}
		return null;
	}

	static public Zgloszenie szukajZgloszenie(int ID) {
		for(Zgloszenie n : zgloszenia) {
			if (n.getID() == ID) return n;
		}
		return null;
	}

	public static Obywatel dodajObywatela(int PESEL, String imie, String nazwisko, String plec) {
		if(Aplikacja.szukajObywatela(PESEL)!=null) return null;
		Obywatel n = new Obywatel();
		n.setPesel(PESEL);
		n.setImie(imie);
		n.setNazwisko(nazwisko);
		n.setPlec(plec);
		obywatele.add(n);
		return n;
	}

	public static void main(String[] args) {
		dodajObywatela(1, "Jan", "Kowalski", "M");
		szukajObywatela(1).dodajDokument(0, "Wizytowka", "Startowy dokument testowy", new java.util.Date());
		ArrayList<String> zmiany = new ArrayList<String>();
		zmiany.add("");
		zmiany.add("Iksinski");
		zmiany.add("2");
		zmiany.add("");
		ArrayList<Dokument> zmianyD = new ArrayList<Dokument>();
		zmianyD.add(szukajDokument(0));
		dodajZgloszenie(1, "Testowe zgloszenie", false, null, zmiany);
		dodajZgloszenie(2, "Testowe zgloszenie dokumenty", true, zmianyD, null);
		for(String i : modelObywatelow()) System.out.println(i);
		for(String i : modelDokumentow()) System.out.println(i);
		for(String i : modelZgloszen()) System.out.println(i);
		szukajZgloszenie(0).rozpatrz(true);
		for(String i : modelObywatelow()) System.out.println(i);
		for(String i : modelZgloszen()) System.out.println(i);
	}

	public static ArrayList<String> modelObywatelow() {
		ArrayList<String> answer = new ArrayList<String>();
		for (Obywatel i : obywatele) answer.add(i.toString());
		return answer;
	}

	public static ArrayList<String> modelDokumentow() {
		ArrayList<String> answer = new ArrayList<String>();
		for (Dokument i : dokumenty) answer.add(i.toString());
		return answer;
	}

	public static ArrayList<String> modelZgloszen() {
		ArrayList<String> answer = new ArrayList<String>();
		for (Zgloszenie i : zgloszenia) answer.add(i.toString());
		return answer;
	}

}