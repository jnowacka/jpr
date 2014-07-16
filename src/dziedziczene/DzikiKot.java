package dziedziczene;

public class DzikiKot {

	private Miska mojaMiska;
	private int waga = 10;
	
	
	public DzikiKot() {
		this.mojaMiska = new Miska();
		this.mojaMiska.nasypKarme();
	}
	
	public void jedz() {
		try {
			mojaMiska.zmniejszenieZawartosci();
		} catch (Exception e) {
			System.out.println("wyst¹pi³ wyj¹tek: "+e.getMessage());
			mojaMiska.nasypKarme();
			//e.printStackTrace();
		}
		this.waga++;
	}
}
