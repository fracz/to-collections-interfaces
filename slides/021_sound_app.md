## `SoundApp.java`

```java
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
```

<span class="fragment" data-code-focus="3-6"></span>
<span class="fragment" data-code-focus="8-10"></span>

#### Wynik
```bash
Brzdek
Fiu fiu
Puuuuuuuuuuuuuuu
```
