public class SoundApp {
    public static void main(String... args) {
        Instrument guitar = new Guitar();
        Instrument flute = new Flute();
        Instrument trombone = new Trombone();

        guitar.play();
        flute.play();
        trombone.play();
    }
}
