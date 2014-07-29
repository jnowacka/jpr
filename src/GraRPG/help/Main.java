package GraRPG.help;

public class Main {

	public static void main(String[] args) {
		
		
		Temat bronie = new Temat("BRONIE");
		Temat miecze = new Temat("MIECZE");
		bronie.dodajPodtemat(miecze);
		
		Pytanie mieczePytanie1 = new Pytanie("Jak¹ moc ma domyœlny miecz?");
		mieczePytanie1.setOdpowiedz("10 DPS");
		miecze.dodajPytanie(mieczePytanie1);
		
		Pytanie mieczePytanie2 = new Pytanie("Który miecz jest najlepszy?");
		mieczePytanie2.setOdpowiedz("Super-mega-platynowy miecz");
		miecze.dodajPytanie(mieczePytanie2);
		
		Temat inneBronie = new Temat("INNE BRONIE");
		bronie.dodajPodtemat(inneBronie);
		
		Pytanie inneBroniePytanie1 = new Pytanie("Czy ksiê¿niczki te¿ maj¹ jak¹œ broñ?");
		inneBroniePytanie1.setOdpowiedz("Tak, urok osobisty. Zwiêksza siê on kiedy ksiê¿niczka koñczy 18 lat.");
		inneBronie.dodajPytanie(mieczePytanie2);
		
		Temat postacie = new Temat("POSTACIE W GRZE");
		Pytanie postaciePytanie1 = new Pytanie("Ile jest rodzajów postaci w grze?");
		postaciePytanie1.setOdpowiedz("Na razie dwie - rycerze i magowie. Ale nasza super elastyczna konstrukcja fabryk postaci pozwala ³atwo rozwin¹æ grê o nowe postacie. Planujemy ksiê¿niczki.")

		Temat pomocCala =  new Temat("POMOC DO GRY LASKI I MIECZE");
		pomocCala.dodajPodtemat(bronie);
		pomocCala.dodajPodtemat(postacie);
		pomocCala.drukuj();
		
		
	}

}
