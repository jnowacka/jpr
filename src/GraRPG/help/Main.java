package GraRPG.help;

public class Main {

	public static void main(String[] args) {
		
		
		Temat bronie = new Temat("BRONIE");
		Temat miecze = new Temat("MIECZE");
		bronie.dodajPodtemat(miecze);
		
		Pytanie mieczePytanie1 = new Pytanie("Jak� moc ma domy�lny miecz?");
		mieczePytanie1.setOdpowiedz("10 DPS");
		miecze.dodajPytanie(mieczePytanie1);
		
		Pytanie mieczePytanie2 = new Pytanie("Kt�ry miecz jest najlepszy?");
		mieczePytanie2.setOdpowiedz("Super-mega-platynowy miecz");
		miecze.dodajPytanie(mieczePytanie2);
		
		Temat inneBronie = new Temat("INNE BRONIE");
		bronie.dodajPodtemat(inneBronie);
		
		Pytanie inneBroniePytanie1 = new Pytanie("Czy ksi�niczki te� maj� jak�� bro�?");
		inneBroniePytanie1.setOdpowiedz("Tak, urok osobisty. Zwi�ksza si� on kiedy ksi�niczka ko�czy 18 lat.");
		inneBronie.dodajPytanie(mieczePytanie2);
		
		Temat postacie = new Temat("POSTACIE W GRZE");
		Pytanie postaciePytanie1 = new Pytanie("Ile jest rodzaj�w postaci w grze?");
		postaciePytanie1.setOdpowiedz("Na razie dwie - rycerze i magowie. Ale nasza super elastyczna konstrukcja fabryk postaci pozwala �atwo rozwin�� gr� o nowe postacie. Planujemy ksi�niczki.")

		Temat pomocCala =  new Temat("POMOC DO GRY LASKI I MIECZE");
		pomocCala.dodajPodtemat(bronie);
		pomocCala.dodajPodtemat(postacie);
		pomocCala.drukuj();
		
		
	}

}
