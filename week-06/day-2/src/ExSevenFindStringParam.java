import java.util.List;
import java.util.stream.Collectors;

public class ExSevenFindStringParam {
  public static List<String> getResult(List<String> strList, char p){
//    String c = p.toString(); // this would work if p is Character
    String c = Character.toString(Character.toUpperCase(p));

    strList = strList
        .stream()
        .filter(str -> str.startsWith(c))
        .collect(Collectors.toList());
    return strList;
  }
}
