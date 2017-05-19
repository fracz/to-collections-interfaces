public class SoundApp {
    public static void main(String... args) {
        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(new Guitar());
        orchestra.addInstrument(new Flute());
        orchestra.addInstrument(new Trombone());
        orchestra.play();
    }
}
