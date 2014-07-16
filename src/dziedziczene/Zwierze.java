package dziedziczene;

public abstract class Zwierze {

	private Miska mojaMiska;
	private int waga = 10;
	public int publicWaga=10;
	public abstract void dajGlos();
	
	public void jedz() throws Exception {
		mojaMiska.zmniejszenieZawartosci();
		this.waga++;
	}
	
	public void przypisanieMiski(Miska miskaDoPrzypisania) {
		this.mojaMiska = miskaDoPrzypisania;
	}
}
