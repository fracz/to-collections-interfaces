package orchestra;

public class Opera {
	public static void main(String[] args) {
		Orchestra trombones = new Orchestra();
		trombones.addInstrument(new Trombone());
		trombones.addInstrument(new Trombone());
		trombones.addInstrument(new Trombone());
		
		Orchestra guitars = new Orchestra();
		guitars.addInstrument(new Guitar());
		guitars.addInstrument(new Guitar());
		guitars.addInstrument(new Guitar());
		
		Orchestra orchestra = new Orchestra();
		orchestra.addInstrument(trombones);
		orchestra.addInstrument(guitars);
		orchestra.addInstrument(trombones);
		
		Instrument whatever = orchestra;
		whatever.play();
	}
}
