package wzorcoweAkwarium;
import java.util.ArrayList;


public class Akwarium {

	private Filtr mojFiltr = new Filtr();
	private ArrayList<Rybka> rybki = new ArrayList<>();
	
	public void wlaczFlitr() {
		mojFiltr.wlacz();
	}

	public void dodajRybke(String imie) {
		rybki.add(new Rybka(imie));
	}

	public void rybkiPlywaja() {
		for(Rybka r: rybki) {
			r.plyn();
		}
		
	}

}
