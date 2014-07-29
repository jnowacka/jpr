package AkwariumAdapterowe;

public class Main {

	public static void main(String[] args) {
		Akwarium mojeAkwarium = new Akwarium();
		Rybka r = new Rybka();
		Zlow z = new Zlow();
		mojeAkwarium.dodajZwierze(r);
		mojeAkwarium.dodajZwierze(z);

		mojeAkwarium.uruchom();
		
	}

}
