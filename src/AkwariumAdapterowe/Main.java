package AkwariumAdapterowe;

import WtyczkaDoAkwarium.Krewetka;

public class Main {

	public static void main(String[] args) {
		Akwarium mojeAkwarium = new Akwarium(); //zostaje
		Rybka r = new Rybka(); //zostaje
		Zlow z = new Zlow(); //zostaje
		Krewetka k = new Krewetka();
		AdapterKrewetki ad1 = new AdapterKrewetki(k);
		
		  mojeAkwarium.dodajZwierze(r);
		  mojeAkwarium.dodajZwierze(z);
		  mojeAkwarium.dodajZwierze(ad1);
		  mojeAkwarium.zwierzakiPlywaja();

	}

}
