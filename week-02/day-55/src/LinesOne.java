import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesOne {
    public static void mainDraw(Graphics graphics) {

        //create starting coordinates for left side
        // observation: the sides are divided into 16 parts
        // 13 of which are lines
        int x = 0;
        int y = 0;
        int step = (HEIGHT) / 16;

//        lines (x, y, step, graphics);
//        rombus (x, y, step, graphics);

        int [] baseL = {0,320};
        int [] baseR = {320,320};
        int [] tip = {160, 43};

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





    public static void lines(int x, int y, int step, Graphics g) {
        //left side drawing
        g.setColor(new Color(50,205,50));

        for (int j = 0; j < 13;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
                g.drawLine(x, y + step * 3 + j * step,  (int) (step)  + j * step, (HEIGHT));
        }
        // right side drawing

        g.setColor(new Color(221,160,221));

        for (int j = 0; j < 13;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
                g.drawLine(x + step * 3 + j * step, y, (WIDTH), (int) (step)  + j * step);
        }
    }

    public static void rombus(int x, int y, int step, Graphics g) {
        // this task is similar to the previous one just has the plane divided in 4
        g.setColor(new Color(50,205,50));
        int nStep = step /2;

        for (int j = 0; j < 16;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
            g.drawLine(WIDTH/2, y + j * nStep,  WIDTH/2 + j * nStep, (HEIGHT/2));
        }

        for (int j = 0; j < 16;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
            g.drawLine(WIDTH/2, (HEIGHT)  - j * nStep,  WIDTH/2 + j * nStep, (HEIGHT/2));
        }

        for (int j = 0; j < 16;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
            g.drawLine(WIDTH/2, y + j * nStep,  WIDTH/2 - j * nStep, (HEIGHT/2));
        }

        for (int j = 0; j < 16;j++) {
//            for (int i = 0; i < 1; i++) { // this is for one of the nodes I need 12 more
            g.drawLine(WIDTH/2, (HEIGHT)  - j * nStep,  WIDTH/2 - j * nStep, (HEIGHT/2));
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