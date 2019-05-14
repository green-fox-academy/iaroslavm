import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExOneEvenNumbers {

  public static List<Integer> getEven(List<Integer> numbers){
    numbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    return numbers;
  }
}
