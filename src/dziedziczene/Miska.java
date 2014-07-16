package dziedziczene;

public class Miska {

	private int iloscChrupkow = 0;
	public int publicIloscChrupkow = 0;
	
	
	
	public void nasypKarme() {
		this.iloscChrupkow = 10;
	}
	
	public void zmniejszenieZawartosci() throws Exception {
		if(this.iloscChrupkow <= 0) {
			//Exception wyjatek = new Exception();
			//throw wyjatek;
			throw new Exception("Nie da siê jeœæ z pustej miski!");
		}
		else {
			this.iloscChrupkow--;
		}
	}
	
	public int ileChrupkow() {
		return this.iloscChrupkow;
	}
}

