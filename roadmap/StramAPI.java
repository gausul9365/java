
/*
 1 Intermediate Operations (Lazy)

These return a new stream and are not executed until a terminal operation is called.

filter(Predicate<T>)

map(Function<T, R>)

sorted()

distinct()

limit(n)

skip(n)
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramAPI {
  public static void main(String[] args) {






    List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
    List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
    System.out.println(evenNumbers);


    List <Integer> numbers2 = Arrays.asList(10, 15, 20, 25, 30);

    List<Integer> evenNumber = numbers2.stream().filter(n -> n%2)
  }






}
