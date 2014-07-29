package GraRPG.rycerze;

import GraRPG.interfejsy.Bron;
import GraRPG.interfejsy.FabrykaPostaci;
import GraRPG.interfejsy.NakycieGlowy;
import GraRPG.interfejsy.Stroj;

public class FabrykaRycerzy implements FabrykaPostaci {

	@Override
	public NakycieGlowy tworzNakrycieGlowy() {
		return new Helm();
	}

	@Override
	public Stroj tworzStroj() {
		return new Zbroja();
	}

	@Override
	public Bron tworzBron() {
		return new Miecz();
	}

}
