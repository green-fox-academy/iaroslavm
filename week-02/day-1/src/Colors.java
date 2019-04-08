import java.util.Arrays;

public class Colors {

    public static void main(String[] args) {
        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        String[][] matrix = new String[3][5];
        for (int i = 0; i < matrix.length; i++) {
            if (i == 0) {
                int k = 0;
                for (String j : green) {
                    matrix[i][k] = j;
                    k++;
                }
            } else if (i == 1) {
                int k = 0;
                for (String j : red) {
                    matrix[i][k] = j;
                    k++;
                }
            } else {
                int k = 0;
                for (String j : pink) {
                    matrix[i][k] = j;
                    k++;

                }
            }

        }
        System.out.println(Arrays.toString(matrix[2]));
    }
}

