import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Log {

    public static void main (String[] args) {

        System.out.println(ratio());
//        System.out.println(Arrays.toString(unique()));

    }

    public static double ratio() {
        try {
            Path filePath = Paths.get("assets/logs.txt");
            List<String> logFile = Files.readAllLines(filePath);
            int size = logFile.size();
            String [] ip = new String [size];
            String [] post = new String [size];
            int index = 0;
            for (String log : logFile) {
                ip[index] = log.split("   ")[1].trim();
                post[index] = log.split("   ")[2].trim();
                index++;
            }
//            System.out.println(Arrays.toString(post));
            double postCount = 0;
            for (String each : post) {
                if (each.equals("POST /")) {
                    postCount++;
                }
            }
            System.out.println(post.length);
            double postRatio = (post.length - postCount) / postCount; // how to calculate double??

            return postRatio;


        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String [] unique() {
        try {
            Path filePath = Paths.get("assets/logs.txt");
            List<String> logFile = Files.readAllLines(filePath);
            int size = logFile.size();
            String [] ip = new String [size];
            String [] post = new String [size];
            int index = 0;
            for (String log : logFile) {
                ip[index] = log.split("   ")[1].trim();
                post[index] = log.split("   ")[2].trim();
                index++;
            }
            System.out.println(Arrays.toString(ip));
            System.out.println(Arrays.toString(post));
            HashMap<String,Integer> uniqueIPs = new HashMap<>();
            int index2 = 0;
            for (String i : ip) {
                uniqueIPs.put(i,index2);
                index2++;
            }
            String [] uniqueIParray = uniqueIPs.keySet().toArray(new String [uniqueIPs.size()]);
            System.out.println(uniqueIParray.length);
            System.out.println(ip.length);

            return uniqueIParray;


        } catch (IOException e) {
            e.printStackTrace();
            return new String [1];
        }


    }
}
