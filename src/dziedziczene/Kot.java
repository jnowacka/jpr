package dziedziczene;

public class Kot extends Zwierze {

	private int dlugoscPazurow;
	
	@Override
	public void dajGlos() {
		System.out.println("MIAAAAAUUUUUUUUU");
	}

	public int getDlugoscPazurow() {
		return dlugoscPazurow;
	}

	public void setDlugoscPazurow(int dlugoscPazurow) {
		if(dlugoscPazurow < 0) dlugoscPazurow =0;
		this.dlugoscPazurow = dlugoscPazurow;
	}

}
