import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Loterry {
    public static void main(String[] args){
        try {
            Path loterryPath = Paths.get("assets/loterry.txt");
            List<String> loterryList = Files.readAllLines(loterryPath);
            List<Integer> loterryNumbers = new ArrayList<>();

            for (String each : loterryList) {
                loterryNumbers.add(Integer.parseInt(each.split(";")[11]));
                loterryNumbers.add(Integer.parseInt(each.split(";")[12]));
                loterryNumbers.add(Integer.parseInt(each.split(";")[13]));
                loterryNumbers.add(Integer.parseInt(each.split(";")[14]));
                loterryNumbers.add(Integer.parseInt(each.split(";")[15]));
            }

            List<Integer> uniqueList = new ArrayList<>();
            for (int each : loterryNumbers) {
                if(!uniqueList.contains(each)){
                    uniqueList.add(each);
                }
            }

            HashMap<Integer,Integer> valueCount = new HashMap<>();
            for (Integer each : uniqueList){
                Integer count = 0;
                for (int i = 0; i < loterryNumbers.size();i++){
                    if(loterryNumbers.get(i).equals(each)) {
                        count++;
                        valueCount.put(each, count);
                    }
                }
            }

            int [] countArray = new int [90];
            int [] numberArray = new int [90];
            int count = 0;
            for (Integer each : valueCount.keySet()){
                countArray[count] = valueCount.get(each);
                numberArray[count] = each;
                count++;
            }

            List<Integer> frequentValues = new ArrayList<>();
            List<Integer> frequentIndex = new ArrayList<>();

            int [] sortArray = countArray.clone();
            Arrays.sort(sortArray);
            System.out.println(Arrays.toString(sortArray));

            for(int i = 85; i <= 89; i++) {
                for (int j = 0; j < sortArray.length; j++) {
                    if (sortArray[i] == countArray[j] && !frequentIndex.contains(j+1)) {
                        frequentIndex.add(j + 1);
                        frequentValues.add(sortArray[i]);
                    }
                }
            }
            System.out.println(frequentIndex.subList(1,6));
            System.out.println(frequentValues.subList(1,6));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
