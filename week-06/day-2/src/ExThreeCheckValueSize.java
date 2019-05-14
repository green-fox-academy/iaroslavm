import java.util.List;
import java.util.stream.Collectors;

public class ExThreeCheckValueSize {
  public static List<Integer> getResult(List<Integer> numbers){
    numbers = numbers.stream().map(x -> x*2).filter(x -> x > 20).collect(Collectors.toList());
    return numbers;
  }
}
