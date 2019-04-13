import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesWithRecursion {
    public static void mainDraw(Graphics graphics) {

        //starting vars
    int step = WIDTH/16;
    int startY = step*3;
    int startX = 0;
    int endX = step;
    int endY = HEIGHT;

    int endR = step;

    draw(step, startX, startY,endX,endY,graphics);

    }

    public static void draw(int step, int startX, int startY, int endX, int endY, Graphics g) {

        g.drawLine(startX, startY, endX, endY);

        if (startY+ step < 320) {

            draw(step, startX,startY + step, endX + step,endY, g);


        }

        if (startX + 3*step + step < 320) {


            draw(step, startX + 3*step + step,0, WIDTH,startX + step, g);

        }

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