## `Lottery.java`

<pre><code class="hljs lang-java" style="max-height: initial">public class Lottery {
    public static void main(String... args) {
        List&lt;Integer> numbers = new ArrayList&lt;>();
        Random generator = new Random();

        while (numbers.size() < 6) {
            int number = generator.nextInt(48) + 1;
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);
    }
}
</code></pre>

#### Przykładowy wynik
```bash
[6, 7, 25, 30, 34, 40]
```
