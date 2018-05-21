package orchestra;

import java.util.ArrayList;

public class Orchestra implements Instrument {
	private ArrayList<Instrument> instrumenty = new ArrayList<>();
	
	public void addInstrument(Instrument instrument) {
		instrumenty.add(instrument);
	}
	
	public void play() {
		for (Instrument instrument : instrumenty) {
			instrument.play();
		}
	}
}
