import java.util.List;

public class ExFourMeanOdds {
  public static double getDoubleResult(List<Integer> numbers){
    double mean = numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToDouble(x -> x)
        .average()
        .orElse(Double.NaN);
    return mean;
  }

  public static double getIntResult(List<Integer> numbers){
    double mean = numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .average()
        .orElse(-1);
    return mean;
  }
}
