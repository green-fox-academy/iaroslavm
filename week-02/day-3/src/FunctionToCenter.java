import apple.laf.JRSUIConstants;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;
        int step = 20;
        int nLines = (int) (WIDTH*2 + HEIGHT*2)/(step);

        System.out.println(nLines);
        System.out.println(nLines);

        System.out.println((int) (nLines *  (double) 2/4));

        for (int i = 0; i <= nLines; i++){
            if (i <= nLines/4) {
                y = 0;
                lines(x,y, graphics);
                x = x + step;
            } else if (i > nLines/4 && i <= (int) (nLines *  (double) 2/4) ) {
                x = WIDTH;
                lines(x,y, graphics);
                y = y + step;
            } else if (i > (int) (nLines *  (double) 2/4)  && i <= (int) (nLines *  (double) 3/4) ) {
                y = HEIGHT;
                lines(x,y, graphics);
                x = x - step;
            } else {
                x = 0;
                lines(x,y, graphics);
                y = y - step;
            }
        }
    }

    public static void lines(int x, int y, Graphics graphics) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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