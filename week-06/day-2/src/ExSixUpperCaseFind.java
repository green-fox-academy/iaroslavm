import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExSixUpperCaseFind {
  public static List<Character> getResult(String str){
    Character [] charArray = str
        .chars()
        .mapToObj(c -> (char) c) // by default it returns c as integer
        .toArray(Character[]::new); // this could be a lambda

    List<Character> charList = Arrays.asList(charArray);

    charList = charList
        .stream()
//        .filter(Character::isUpperCase) // this could be a lambda
        .filter(c -> Character.isUpperCase(c))
        .collect(Collectors.toList());
    return charList;
  }

}
