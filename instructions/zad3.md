## Wielokąty

Stwórz hierarchię klas opisujących różne rodzaje wielokątów, tak by odpowiadała sytuacji przedstawionej poniżej:

```
	 Polygon
    /      \
Rectangle   Triangle
   |
Square
```

- `Polygon` powinien zawierać:
-- atrybut `sides` będący listą długości boków wielokąta (wyrażonych jako liczby całkowite)
-- metodę `perimeter()` obliczającą i zwracającą obwód wielokąta
-- metodę `area()` obliczającą pole powierzchni wielokąta
- Zastanów się, czy klasa `Polygon` posiada wystarczające informacje by dostarczyć implementacji obu metod.
- Zwróć szczególną uwagę na implementację konstruktorów - `Polygon` powinien przyjmować listę boków, `Triangle` dokładnie trzy konkretne boki, `Rectangle` dwa boki, a `Square` jeden.

## Przydatne informacje

### Klasy abstrakcyjne

Klasy abstrakcyjne wyglądają jak zwykłe klasy, ale posiadają dwie cechy upodabniające je do interfejsu:
- nie można tworzyć obiektów tych klas
- niektóre lub wszystkie metody mogą nie mieć zdefiniowanego ciała

Czym zatem różni się klasa abstrakcyjna od interfejsu? Przede wszytkim może posiadać atrybuty i operować na nich tak jak normalna klasa. Ponadto wybrane metody mogą być w pełni zdefiniowane. 

W praktyce klas abstrakcyjnych używamy wtedy, gdy mamy do czynienia z typem, który sam w sobie nie posiada sensu (patrz przykład z samochodem i pojazdem), ale jesteśmy w stanie precyzyjnie opisać część jego zachowań.

Przykład: Każdy towar w sklepie posiada kod kreskowy. Sposób kasowania produktu, niezależnie od jego rodzaju jest taki sam. Ale już sposób pakowania zależy od wielu czynników. Przetwory przechowywane są w słoikach, mięso w folii, a pieczywo w papierowych torebkach. Jesteśmy w stanie powiedzieć, że produkt będzie miał opakowanie, ale nie wiemy dokładnie jakie. Potrzebujemy do tego informacji o typie produktu.

Zwróćmy także uwagę, że możemy stworzyć obiekt typu "chleb", ale tworzenie obiektu typu "towar" nie ma sensu i znaczenia (towar to pojęcie **abstrakcyjne**).

Klasę abstrakcyjną możemy zdefiniować w następujący sposób:
```java
public abstract class Product {
   private Barcode code;
   
   public int scan() {
      return code.getValue(); // przykładowe skanowanie kodu kreskowego
   }
   
   public abstract Package getPackageType(); // metoda abstrakcyjna zwracająca rodzaj opakowania
}

public class Bread extends Product {
  
  public Package getPackageType() {
      return new Package("Paper bag"); // przykładowe opakowanie
  }
}
```

W powyższym przykładzie widzimy, że aby zadeklarować klasę jako abstrakcyjną należy w dodać słowo kluczowe `abstract` przed słowem `class`.

Dodatkowo **każda** metoda abstrakcyjna musi również zostać oznaczona słowem kluczowym `abstract`.

Podobnie jak w przypadku interfejsów, klasa która rozszerza klasę abstrakcyjną **musi** zdefiniować wszystkie zadeklarowane wyżej metody abstrakcyjne... chyba że sama jest klasą abstrakcyjną.