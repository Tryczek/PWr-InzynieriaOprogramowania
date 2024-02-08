package com.mycompany.inzynieriaoprogramowania;

import java.util.Date;

public class Dokument {

	protected int ID;
	protected int PESEL;
	protected String nazwa;
	protected String tresc;
	protected Date data_waznosci;
	
	public String toString() {
		return ID + " " + nazwa + " - obywatel " + PESEL + ", wazne do " + data_waznosci + ": " + tresc;
	}
	
	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getPesel() {
		return this.PESEL;
	}

	public void setPesel(int PESEL) {
		this.PESEL = PESEL;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getTresc() {
		return this.tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public Date getData_waznosci() {
		return this.data_waznosci;
	}

	public void setData_waznosci(Date data_waznosci) {
		this.data_waznosci = data_waznosci;
	}

}