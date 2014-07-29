package GraRPG.Main;

import java.util.Scanner;

import GraRPG.interfejsy.Bron;
import GraRPG.interfejsy.FabrykaPostaci;
import GraRPG.magowie.FabrykaMagow;
import GraRPG.rycerze.FabrykaRycerzy;


public class Main {

	public static void main(String[] args) {
		System.out.println("Tworzenie postaci \n m-Mag \n r-Rycerz");
		Scanner input = new Scanner(System.in);
		String litera = input.nextLine();
		
		FabrykaPostaci fabryka;
		System.out.println(litera);
		if(litera.equals("r")) fabryka = new FabrykaRycerzy();
		else if(litera.equals("m")) fabryka = new FabrykaMagow();
		else {
			System.out.println("Wybra³eœ z³¹ literê");
			return;
		}

		//tworzenie postaci
		System.out.println("Tworzenie postaci wg zadanych parametrów");
		fabryka.tworzNakrycieGlowy();
		fabryka.tworzStroj();
		Bron b = fabryka.tworzBron();
		b.uzyj();
	}

}
