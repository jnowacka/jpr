package dziedziczene;

public class Main {

	public static void main(String[] args) {
		// DZIKI KOT
		/*
		 * DzikiKot bezimienny = new DzikiKot(); for(int i =0;i<11;i++)
		 * bezimienny.jedz();
		 */
		// DOMOWY KOT
		Miska mojaRozowaMiska = new Miska();
		mojaRozowaMiska.nasypKarme();
		// tworzymy kota i przypisujemy mu miske
		Kot filemon = new Kot();
		filemon.przypisanieMiski(mojaRozowaMiska);
		// kot je
		for (int i = 0; i < 11; i++) {
			boolean zjad³ = false;
			do {
				try {
					filemon.jedz();
					zjad³ = true;
				} catch (Exception e) {
					System.out.println("wyst¹pi³ wyj¹tek: "+e.getMessage());
					mojaRozowaMiska.nasypKarme();
					zjad³ = false;
				}
			} while (!zjad³);

		}
	}

}
