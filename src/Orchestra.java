import java.util.ArrayList;
import java.util.List;

public class Orchestra implements Instrument {

    private List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    @Override
    public void play() {
        for (Instrument instrument : this.instruments) {
            instrument.play();
        }
    }
}
