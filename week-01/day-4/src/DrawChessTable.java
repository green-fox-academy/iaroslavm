

public class DrawChessTable {
    public static void main(String[] args) {

        for (int level = 1; level < 9; level++) {
            if (level % 2 != 0) {


                for (int lev = 0; lev < 4; lev++) {
                    System.out.print("% ");

                }
                System.out.print("\n");

            } else {
                    for (int lev = 0; lev < 4; lev++) {
                        System.out.print(" %");
                }
                System.out.print("\n");
            }
        }
    }

}
