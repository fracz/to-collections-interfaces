## `SoundApp.java`

```java
class SoundApp {
    public static void main(String... args) {
        Guitar guitar = new Guitar();
        Flute flute = new Flute();
        Trombone trombone = new Trombone();
        
        guitar.play();
        flute.play();
        trombone.play();
    }
}
```

<span class="fragment" data-code-focus="3-5"></span>
<span class="fragment" data-code-focus="7-9"></span>

#### Wynik
```bash
Brzdek
Fiu fiu
Puuuuuuuuuuuuuuu
```
