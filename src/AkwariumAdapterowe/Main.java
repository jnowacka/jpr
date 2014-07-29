package AkwariumAdapterowe;

public class Main {

	public static void main(String[] args) {
		Akwarium mojeAkwarium = new Akwarium();
		Rybka r = new Rybka();
		Zlow z = new Zlow();
		
		mojeAkwarium.zwierzaki.add(r);
		mojeAkwarium.zwierzaki.add(z);

		for(Zwierze zwierzak: mojeAkwarium.zwierzaki) {
			zwierzak.plyn();
		}
		
	}

}
