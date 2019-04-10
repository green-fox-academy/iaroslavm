import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int color1 = 0;
        int color2 = 0;
        int color3 = 0;

        for (int i = 0; i < 4; i++) {
            x = 10 + (int) (Math.random()*(401 - 10));
            y = 10 + (int) (Math.random()*(401 - 10));
            width = 50 + (int) (Math.random()*(101 - 50));
            height = 50 + (int) (Math.random()*(101 - 50));

            color1 = 0 + (int) (Math.random()*(101 - 0));
            color2 = 0 + (int) (Math.random()*(101 - 0));
            color3 = 0 + (int) (Math.random()*(101 - 0));

            graphics.setColor(new Color(color1, color2,color3));
            graphics.fillRect(x,y,width,height);
        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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