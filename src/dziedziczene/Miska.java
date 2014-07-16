package dziedziczene;

public class Miska {

	private int iloscChrupkow = 0;
	public int publicIloscChrupkow = 0;
	
	
	
	public void nasypKarme() {
		this.iloscChrupkow = 10;
	}
	
	public boolean zmniejszenieZawartosci() {
		if(this.iloscChrupkow == 0) return false;
		else {
			this.iloscChrupkow--;
			return true;
		}
	}
	
	public int ileChrupkow() {
		return this.iloscChrupkow;
	}
}

