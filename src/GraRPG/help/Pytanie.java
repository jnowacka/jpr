package GraRPG.help;

public class Pytanie {

	private String odpowiedz;
	private String pytanie;
	
	
	public Pytanie(String string) {
		this.pytanie = string;
	}

	public void setOdpowiedz(String string) {
		this.odpowiedz = string;
		
	}

	public void drukuj() {
		System.out.println("PYT: " +this.pytanie);
		System.out.println("ODP: " +this.odpowiedz);
	}

}
