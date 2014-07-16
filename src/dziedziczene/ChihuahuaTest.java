package dziedziczene;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChihuahuaTest {

	@Test
	public void test() {
		
		//WERSJA OBIEKTOWA -> delegowanie odpowiedzialnosci
		//tworzenie i nape�nienie miski
		Miska mojaRozowaMiska = new Miska();
		mojaRozowaMiska.nasypKarme();	
		//tworzymy kota i przypisujemy mu miske
		Kot filemon = new Kot();
		filemon.przypisanieMiski(mojaRozowaMiska);
		//kot je
		filemon.jedz();
		
		//WERSJA PROCEDURALNA -> klasy s� "g�upie", o wszystkim decyduje "main"
		//tworzenie kota i miski +nape�nianie
		Miska drugaMiska = new Miska();
		drugaMiska.publicIloscChrupkow = 10;
		Kot bonifacy = new Kot();
		//karmimy
		drugaMiska.publicIloscChrupkow--;
		bonifacy.publicWaga++;
		
		//WERSJA OBIEKTOWA 2 -> wi�cej zwalamy na kota
		
		DzikiKot bezimienny = new DzikiKot();
		bezimienny.jedz();
				
	}

}
