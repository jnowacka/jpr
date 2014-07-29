package AkwariumAdapterowe;

import java.util.ArrayList;
import java.util.List;

public class Akwarium {

	private List<Zwierze> zwierzaki = new ArrayList<>();
	
	public void dodajZwierze(Zwierze zw) {
		zwierzaki.add(zw);
	}
	
	public void uruchom() {
		for(Zwierze z: zwierzaki) {
			z.plyn();
		}
	}
}
