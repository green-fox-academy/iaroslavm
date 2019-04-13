import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triange {
    public static void mainDraw(Graphics graphics) {

        //create starting coordinates for left side
        // observation: the sides are divided into 16 parts
        // 13 of which are lines
        int x = 0;
        int y = 0;
        int step = (HEIGHT) / 16;

//        lines (x, y, step, graphics);
//        rombus (x, y, step, graphics);

        int [] baseL = {0,340};
        int [] baseR = {340,340};
        int [] tip = {170, 40};

        int [] xPoints = {baseL[0],tip[0],baseR[0]};
        int [] yPoints = {baseL[1],tip[1],baseR[1]};


        transform(xPoints, yPoints, graphics);

    }

    public static void transform(int [] xPoints, int [] yPoints, Graphics g) {

//        int [] xPoints = {baseL[0],tip[0],baseR[0]};
//        int [] yPoints = {baseL[1],tip[1],baseR[1]};



        g.drawPolygon(xPoints,yPoints,3);

//        int [] nxPoints = {xPoints[0],(int) (xPoints[1]*0.9),(int) (xPoints[2] * 0.9)};
//        int [] nyPoints = {yPoints[0],(int) (yPoints[1] / (0.68)),yPoints[2]};

        for (double i = 0; i <= 0.32; i += 0.08) {

            xPoints[1] = (int) (xPoints[1]*0.9);
            yPoints[1] = (int) (yPoints[1] / (0.62 + i));
            xPoints[2] = (int) (xPoints[2]*0.9);

            g.drawPolygon(xPoints, yPoints, 3);
        }





    }





    // Don't touch the code below
    static int WIDTH = 340;
    static int HEIGHT = 340;

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