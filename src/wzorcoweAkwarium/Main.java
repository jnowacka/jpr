package wzorcoweAkwarium;

public class Main {

	public static void main(String[] args) {
		Akwarium akw = new Akwarium();
		akw.wlaczFlitr();
		akw.dodajRybke("Wandzia");
		akw.dodajRybke("tadziu");
		akw.rybkiPlywaja();
		
		
		/*
		 * w odroznieniu od
		
		Akwarium akw = new Akwarium();
		Filtr f = new Filtr();
		akw.mojFiltr = f;
		f.wlacz(); // ew. akw.mojFiltr.wlacz()
		Rybka mojaRybka = new Rybka ("Wandzia");
		akw.rybki.add(mojaRybka);
		*/
	}

}
