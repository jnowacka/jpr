package AkwariumAdapterowe;

import java.util.ArrayList;
import java.util.List;

public class Akwarium {

	private List<Zwierze> zwierzaki = new ArrayList<>();
	
	public void dodajZwierze(Zwierze z) {
		zwierzaki.add(z);
	}

	public void zwierzakiPlywaja() {
		for(Zwierze zwierzak: zwierzaki) {
			zwierzak.plyn();
		}
		
	}

}
