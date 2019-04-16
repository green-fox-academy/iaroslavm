import apple.laf.JRSUIConstants;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class tri2 {
    public static void mainDraw(Graphics graphics){
        int x1 = 0;
        int y1 = HEIGHT;
        int x2 = WIDTH/2;
        int y2 = 0;
        int x3 = WIDTH;
        int y3 = HEIGHT;
        int base = WIDTH;


//        graphics.setColor(Color.pink);
//        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        draw(x1, y1, x2, y2, x3, y3, base, graphics);


    }

    public static void draw(int x1, int y1, int x2, int y2, int x3, int y3, int base, Graphics g) {

        int [] xCor = {x1,x2,x3};
        int [] yCor = {y1,y2,y3};
        g.setColor(Color.white);

        g.fillPolygon(xCor,yCor,3);

        g.setColor(Color.black);
        g.drawPolygon(xCor,yCor,3);



        if (base >= 12) {

            draw(x1,y1, x2 - base/4,y2 + (int) (base/4*Math.sqrt(3)),x3 - base/2, y3, base/2, g);

            draw(x1 + base/2, y1, x2 + base/4, y2 + (int) (base/4*Math.sqrt(3)), x3, y3, base/2, g);

            draw(x1 + base/4, y1 - (int) (base/4*Math.sqrt(3)), x2, y2, x3 - base/4, y3 - (int) (base/4*Math.sqrt(3)), base/2, g);
        }


    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = (int) (400 * Math.sqrt(3));

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