import java.util.List;
import java.util.stream.Collectors;

public class ExEightConcatenateString {
  public static String getResult(String str, List<Character> charList){
    String strAppend = charList.stream()
        .map(Object::toString)
        .collect(Collectors.joining(", ")); // comma ", " is a string ad stream takes Characters so we need to convert Character to string using map
    StringBuilder strB = new StringBuilder();
    str = strB.append(str).append(", ").append(strAppend).toString();
    return str;
  }
}
