package GraRPG.rycerze;

import GraRPG.interfejsy.Bron;

public class Miecz implements Bron {

	public Miecz() {
		System.out.println("Tworz� Miecz");
	}

	@Override
	public void uzyj() {
		System.out.println("RACH CIACH CIACH MACH macham mieczem");
		
	}
}
