import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

       // int[][] newArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] newArray = {{50, 100}, {70, 70}, {80, 90}, {90, 90},
                {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        System.out.println(newArray.length);


            connector(newArray,graphics);

    }

    public static void connector(int [][] arr, Graphics graphics) {

        int size = arr.length;
        int [] x = new int [arr.length];
        int [] y = new int [arr.length];
        int iter = 0;

        for (int [] dot : arr) {
            x[iter] = dot[0];
            y[iter] = dot[1];
            iter++;
        }

        graphics.setColor(Color.green);
        graphics.drawPolygon(x,y,iter);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}