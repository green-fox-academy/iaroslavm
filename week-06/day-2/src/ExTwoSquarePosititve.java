import java.util.List;
import java.util.stream.Collectors;

public class ExTwoSquarePosititve {
  public static List<Integer> getResult(List<Integer> numbers){
    numbers = numbers.stream().filter(x -> x > 0).map(x -> x*x).collect(Collectors.toList());
    return numbers;
  }
}
