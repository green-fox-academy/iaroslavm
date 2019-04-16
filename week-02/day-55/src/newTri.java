import apple.laf.JRSUIConstants;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class newTri {
    public static void mainDraw(Graphics graphics){
        int[] leftXY = {0, HEIGHT, 0, HEIGHT};
        int[] rightXY = {WIDTH, HEIGHT, WIDTH, HEIGHT};
        int[] topXY = {WIDTH/2, (int) (HEIGHT - WIDTH/2*Math.sqrt(3)),
                WIDTH/2, (int) (HEIGHT - WIDTH/2*Math.sqrt(3))};
        int step = 20;
        int top = (int) (HEIGHT - WIDTH/2*Math.sqrt(3));

        draw(leftXY, rightXY, topXY,step, top, graphics);


    }

    public static void draw(int[] leftXY,
                            int[] rightXY,
                            int[] topXY, int step, int top, Graphics g) {

        //coordinates for horizontal line
        int x1 = leftXY[0];
        int y1 = leftXY[1];
        int x2 = rightXY[0];
        int y2 = rightXY[1];

        int x21 = leftXY[2];
        int y21 = leftXY[3];
        int x22 = topXY[0];
        int y22 = topXY[1];

        int x31 = rightXY[2];
        int y31 = rightXY[3];
        int x32 = topXY[2];
        int y32 = topXY[3];


//        3 independent sets of lines

          g.drawLine(x1, y1, x2, y2);
          g.drawLine(x21, y21, x22, y22);
          g.drawLine(x31, y31, x32, y32);


// horizontal line
        if(leftXY[0] <= 200) {

            leftXY[0]  = leftXY[0] + step/2; // horizontal line get shorter by step/2 at every level
            leftXY[1]  = top + (int) ((WIDTH/2 - leftXY[0]) * Math.sqrt(3)); // hor line moves by the
            // (change in base of right half triangle * sqrt(3))
            rightXY[0] = rightXY[0] - step/2; // horizontal line get shorter by step/2 at every level
            rightXY[1] = top + (int) ((WIDTH/2 - leftXY[0]) * Math.sqrt(3));

            draw(leftXY, rightXY, topXY,step,top, g);
        }

        if(leftXY[2] <= 400) {

            leftXY[2] = leftXY[2] + step;
            leftXY[3] = leftXY[3]; //
            topXY[0]  = topXY[0] + step/2;
            topXY[1]  = HEIGHT - (int) ((HEIGHT - leftXY[2]) /2* Math.sqrt(3));

            draw(leftXY, rightXY, topXY, step, top, g);
        }

        if(rightXY[2] >= 20) {

            rightXY[2] = rightXY[2] - step;
            rightXY[3] = rightXY[3]; // 17 is 10*sqrt(3)
            topXY[2]  = topXY[2] - step/2;
            topXY[3]  = HEIGHT - (int) ((0 + rightXY[2]) /2* Math.sqrt(3));

            draw(leftXY, rightXY, topXY, step, top, g);
        }
    }

    // Don't touch the code below
    static int WIDTH = 420;
    static int HEIGHT = 420;

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