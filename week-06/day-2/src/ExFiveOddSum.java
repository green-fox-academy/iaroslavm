import java.util.List;

public class ExFiveOddSum {
  public static int getResult(List<Integer> numbers){
    int sum = numbers.stream()
        .filter(x -> x % 2 !=0)
        .mapToInt(x -> x)
        .sum();
    return sum;
  }
}
