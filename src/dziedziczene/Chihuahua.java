package dziedziczene;

public class Chihuahua extends Pies {
	
	public final String imie;
	
	private static String lacinskaNazwaRasy = "Czi�a�us  ma�us";
	
	@Override
	public void dajGlos() {
		System.out.println("Chihuahua szczeka PIPIPIPI");
	}
	
	public static String podajLacinskaNazweRasy() {
		return lacinskaNazwaRasy;
	}
	
	
	public void chowajSieDoTorebki() {
		System.out.println("chowa sie do torebki");
	}
	public Chihuahua(String imie) {
		this.imie = imie;
		System.out.println("Tworz� chi�a�e");
	}
}
