package dziedziczene;

public class DzikiKot {

	private Miska mojaMiska;
	private int waga = 10;
	
	
	public DzikiKot() {
		this.mojaMiska = new Miska();
		this.mojaMiska.nasypKarme();
	}
	
	public void jedz() {
		boolean czyZjadl = mojaMiska.zmniejszenieZawartosci();
		if(czyZjadl == true) this.waga++;
	}
}
