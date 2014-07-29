package GraRPG.magowie;

import GraRPG.interfejsy.Bron;
import GraRPG.interfejsy.FabrykaPostaci;
import GraRPG.interfejsy.NakycieGlowy;
import GraRPG.interfejsy.Stroj;

public class FabrykaMagow implements FabrykaPostaci {

	@Override
	public NakycieGlowy tworzNakrycieGlowy() {
		return new Tiara();
	}

	@Override
	public Stroj tworzStroj() {
		return new Szata();
	}

	@Override
	public Bron tworzBron() {
		return new Laska();
	}

}
