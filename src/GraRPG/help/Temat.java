package GraRPG.help;

import java.util.ArrayList;

public class Temat {

	String nazwaTematu;
	ArrayList<Temat> podtematy = new ArrayList<>();
	ArrayList<Pytanie> pytania = new ArrayList<>();
	
	public Temat(String string) {
		this.nazwaTematu = string;
	}

	public void dodajPodtemat(Temat podtemat) {
		podtematy.add(podtemat);
		
	}

	public void dodajPytanie(Pytanie pytanie) {
		pytania.add(pytanie);
		
	}

	public void drukuj() {
		System.out.println("-----------------------------");
		System.out.println(this.nazwaTematu);
		System.out.println("-----------------------------");
		for(Temat t: podtematy) {
			t.drukuj();
		}
		for(Pytanie p: pytania) {
			p.drukuj();
		}
		
	}

}
