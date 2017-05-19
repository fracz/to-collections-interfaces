## Loteria

Stwórz klasę `Lottery`, która:

- wylosuje i wypisze na konsolę 6 liczb od 1 do 49
- liczby nie mogą się powtarzać
- liczby powinny być posortowane, rosnąco

W tym celu pomocna okaże się jedna z kolekcji Javy - `ArrayList`. Pozwala ona na przechowanie wielu wartości tego samego typu (w tym przypadku - liczb całkowitych).

Poniżej znajdziesz fragmenty kodu źródłowego, które powinny pomóc Ci przy implementacji.

###### Losowanie liczby od 1 do 49

```java
Random generator = new Random();
int number = generator.nextInt(48) + 1;
```

###### Naturalne sortowanie listy

```java
lista.sort(Comparator.naturalOrder());
```

## Przydatne informacje

### Kolekcje i typy generyczne - wprowadzenie

Do zarządzania zestawami obiektów w Javie możemy używać tablic, ale w praktyce znacznie bardziej przydatne są tzw. **kolekcje**. Istnieje wiele rodzajów kolekcji o różnym zastosowaniu:
- Listy (np. `ArrayList`, `LinkedList`)
- Zbiory (np. `HashSet`, `TreeSet`)
- Mapy (np. `HashMap`)

Kolekcje znajdują się w pakiecie `java.util`.

Wraz z kolekcjami pojawia się pojęcie **typu generycznego**. Jeśli chcemy utworzyć np. obiekt listy `ArrayList`, która posłuży do przechowywania Stringów, powinniśmy napisać: 
```java
ArrayList<String> myList = new ArrayList<>();
```
Przy deklaracji typu widzimy dodatkowo wyrażenie: `<String>`. Oznacza ono, że lista ta jest parametryzowana typem `String` czyli w praktyce posłuży nam do przechowywania elementów typu `String`. Jeśli spróbujemy dodać do niej element innego typu, kompilator zgłosi błąd.

Oczywiście do parametryzacji możemy użyć dowolnego typu obiektowego (klasy). Aby użyć w tym miejscu typu prymitywnego (np. `int`), musimy posłużyć się tzw. typem kopertowym (patrz sekcja niżej).

Klasę, która deklaruje w swojej definicji taki parametr (lub parametry) nazywamy typem generycznym.

### Typy kopertowe

Mówiliśmy już o typach prymitywnych (`int`, `float`, itp.). W niektórych przypadkach (jak przykład powyżej) nie możemy lub nie chcemy używać typu prymitywnego. Dlatego każdy typ prymitywny ma swoją "obiektową" wersję, która go opakowuje (stąd nazwa: "typ kopertowy"):
- `int` -> `Integer`
- `float` -> `Float`
- `boolean` -> `Boolean`
- `char` -> `Character`
- ...

Jak pamiętamy, wielkość liter w nazwach typów w Javie ma znaczenie - teraz widzimy, dlaczego jest to bardzo ważne. Gdy napiszemy `float` z małej litery, użyjemy typu prymitywnego, jeśli z dużej `Float` - obiektowego. 

Typy kopertowe są klasami więc posiadają różne metody, a także nie muszą mieć ustalonej wartości (można im przypisać `null`). Co istotne, Java sama dokonuje konwersji typów prymitywnych na kopertowe i w drugą stronę. Możemy zatem napisać:
```java
Integer a = 3; // konwertujemy 3 typu prymitywnego na obiekt klasy Integer o wartości 3
int b = a; // konwertujemy obiekt klasy Integer na wartość typu prymitywnego
```

Tak jak powiedzieliśmy, typy kopertowe mogą np. posłużyć do parametryzowania typów generycznych. Jeśli chcemy utworzyć listę przechowującą wartości typu `int`, wystarczy napisać:
```java
ArrayList<Integer> myList = new ArrayList<>();
```
 