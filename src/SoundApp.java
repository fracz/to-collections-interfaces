import java.util.ArrayList;
import java.util.List;

public class SoundApp {
    public static void main(String... args) {
        List<Instrument> instruments = new ArrayList<Instrument>();
        instruments.add(new Guitar());
        instruments.add(new Flute());
        instruments.add(new Trombone());

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
