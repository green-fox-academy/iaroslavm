import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class New {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int [] heights = new int [8];


        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                heights [i] = mountainH;
            }
            Arrays.sort(heights);
            String max = String.valueOf(heights[0]);


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(max); // The index of the mountain to fire on.

            System.err.println(Arrays.toString(heights));
        }
    }
}