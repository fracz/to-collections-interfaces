public class SoundApp {
    public static void main(String... args) {
        Guitar guitar = new Guitar();
        Flute flute = new Flute();
        Trombone trombone = new Trombone();

        guitar.play();
        flute.play();
        trombone.play();
    }
}
