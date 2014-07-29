package AkwariumAdapterowe;

import WtyczkaDoAkwarium.Krewetka;

public class AdapterKrewetki extends Zwierze {

	private Krewetka mojaKrewetka;
	
	public AdapterKrewetki(Krewetka k) {
		mojaKrewetka = k;
	}

	@Override
	public void plyn() {
		mojaKrewetka.spaceruj();
	}
}
