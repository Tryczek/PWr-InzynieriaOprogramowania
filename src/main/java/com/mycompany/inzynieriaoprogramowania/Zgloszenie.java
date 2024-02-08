package com.mycompany.inzynieriaoprogramowania;

import java.util.ArrayList;

public class Zgloszenie {
	
	static int zgloszenie_number = 0;
	
	protected int ID;
	protected int pesel;
	protected String tresc;
	protected ArrayList<String> dane_dotyczace = new ArrayList<String>();
	protected boolean rozpatrzone;
	
	public String toString() {
		String answer = ID + " - obywatel " + pesel + " - zmiana danych: ";
		for (int i = 0; i < dane_dotyczace.size(); i++) {
			if(dane_dotyczace.get(i) == "") continue;
			switch(i) {
			case 0:
				answer += "imie > ";
				break;
			case 1:
				answer += "nazwisko > ";
				break;
			case 2:
				answer += "PESEL > ";
				break;
			case 3:
				answer += "plec > ";
				break;
			}
			answer += dane_dotyczace.get(i) + ", ";
		}
		answer += "- rozpatrzone: " + rozpatrzone;
		return answer;
	}
	
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getPesel() {
		return this.pesel;
	}

	public void setPesel(int pesel) {
		this.pesel = pesel;
	}

	public String getTresc() {
		return this.tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public ArrayList<String> getDane_dotyczace() {
		return this.dane_dotyczace;
	}

	public void setDane_dotyczace(ArrayList<String> dane_dotyczace) {
		this.dane_dotyczace = dane_dotyczace;
	}

	public boolean getRozpatrzone() {
		return this.rozpatrzone;
	}

	public void setRozpatrzone(boolean rozpatrzone) {
		this.rozpatrzone = rozpatrzone;
	}
	
	public void rozpatrz(boolean decyzja) {
		Obywatel obywatel = Aplikacja.szukajObywatela(this.pesel);
		if(decyzja) {
			for(int i = 0; i < 4; i++) {
				switch(i) {
				case 0:
					if(!dane_dotyczace.get(0).equals("")) obywatel.imie = dane_dotyczace.get(0);
					break;
				case 1:
					if(!dane_dotyczace.get(1).equals("")) obywatel.nazwisko = dane_dotyczace.get(1);
					break;
				case 2:
					if(!dane_dotyczace.get(2).equals("")) obywatel.pesel = Integer.parseInt(dane_dotyczace.get(2));
					break;
				case 3:
					if(!dane_dotyczace.get(3).equals("")) obywatel.plec = dane_dotyczace.get(3);
					break;
				}
			}
		}
		this.rozpatrzone = true;
	}

}