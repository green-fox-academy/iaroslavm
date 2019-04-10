import apple.laf.JRSUIConstants;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        int xLeftTop = WIDTH/4;
        int yLeftTop = HEIGHT/4;
        int xRightTop = (WIDTH * 3/4);
        int yRightTop = HEIGHT/4;
        int xLeftBottom = WIDTH/4;
        int yLeftBottom = HEIGHT* 3/4;
        int xRightBottom = (WIDTH * 3/4);
        int yRightBottom = HEIGHT* 3/4;



        graphics.setColor(Color.blue);
        graphics.drawLine(xLeftTop,yLeftTop, xRightTop,yRightTop);
        graphics.setColor(Color.RED);
        graphics.drawLine(xLeftTop,yLeftTop, xLeftBottom,yLeftBottom);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(xRightTop,yRightTop, xRightBottom,yRightBottom);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(xLeftBottom,yLeftBottom, xRightBottom,yRightBottom);

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