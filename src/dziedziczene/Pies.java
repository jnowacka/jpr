package dziedziczene;


public class Pies extends Zwierze {
	
	//public int liczba = 10;
	@Override
	public void dajGlos() {
		System.out.println("pies szczeka hauhauhau");
	}
	
	
	public Pies() {
		System.out.println("Tworze psa");
	//	System.out.println("Zwierze powinno juz byc utworzone wiec moge sie do niego odwo³aæ:" +super.atrybutZwierza);
	}

	
	
	
	/*public void testZakresu() {
		System.out.println(liczba);
		System.out.println(this.liczba);
		System.out.println(super.liczba);
		for(int i = 0;i<2;i++) {
			int liczba = 15;
			System.out.println(liczba);
		}
		System.out.println(liczba);
	}*/
}
