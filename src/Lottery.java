import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lottery {
    public static void main(String... args) {
        List<Integer> numbers = new ArrayList<>();
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
