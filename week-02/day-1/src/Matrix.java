public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (j == matrix[i].length - 1) {
                        System.out.println("1 ");
                    } else {
                        System.out.print("1 ");
                    }
                } else {
                    if (j == matrix[i].length - 1) {
                        System.out.println("0 ");
                    } else {
                        System.out.print("0 ");
                    }

                }


            }


        }
    }
}
