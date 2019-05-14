import java.util.List;

public class GetIndex {
  int index = 0;

  public int getIndex(List<Integer> list, int i){
    for (int j = 0; j < list.size(); j++) {
      if(list.get(j) == i) {
        index = j;
      }
    }
    return index;
  }

  public int getStringIndex(List<String> list, String str){
    for (int j = 0; j < list.size(); j++) {
      if(list.get(j).equals(str)) {
        index = j;
      }
    }
    return index;
  }
}