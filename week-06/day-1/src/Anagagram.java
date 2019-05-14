import java.util.Arrays;

public class Anagagram {

  public static void main(String[] args) {

    isAnagram("Ksenia","Ksenia");
  }

 public static boolean isAnagram(String str1, String str2){
    boolean result = false;
    if(str1.length() == str2.length()){
      char[] str1Array = str1.toLowerCase().toCharArray();
      char[] str2Array = str2.toLowerCase().toCharArray();
      Arrays.sort(str1Array);
      Arrays.sort(str2Array);

      if(Arrays.equals(str1Array, str2Array)){
        result = true;
      }
    }
    return result;
  }
}
