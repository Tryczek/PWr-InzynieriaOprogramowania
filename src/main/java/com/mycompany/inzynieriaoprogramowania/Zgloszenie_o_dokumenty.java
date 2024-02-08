package com.mycompany.inzynieriaoprogramowania;

import java.util.ArrayList;

public class Zgloszenie_o_dokumenty extends Zgloszenie {

	protected ArrayList<Dokument> dokumenty = new ArrayList<Dokument>();
	
	public String toString() {
		String answer = ID + " - obywatel " + pesel + " - zmiana dokumentow: ";
		for (Dokument i : dokumenty) {
			answer += i.getID() + " ";
		}
		answer += "- rozpatrzone: " + rozpatrzone;
		return answer;
	}

	public ArrayList<Dokument> getDokumenty() {
		return this.dokumenty;
	}

	public void setDokumenty(ArrayList<Dokument> dokumenty) {
		this.dokumenty = dokumenty;
	}

}