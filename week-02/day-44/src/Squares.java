import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

    static int WIDTH = 729;
    static int HEIGHT = 729;
    static int XSTART = 0;
    static int YSTART = 0;

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.

        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        drawSquare(XSTART, YSTART, WIDTH, graphics);



    }

    public static void drawSquare(int x, int y, int size, Graphics g) {

        g.setColor(Color.black);
        g.drawRect(x,y,size,size);

        if (size >= 9) {

            //top square
            drawSquare(x + size / 3, y, size / 3, g); // one third from the 0 0 coordinates
            //right square
            drawSquare(x + size * 2 / 3, y + size / 3, size / 3, g);
//            //bottom square
            drawSquare(x + size / 3, y + size * 2 / 3, size / 3, g);
//            //left square
            drawSquare(x, y  + size / 3, size / 3, g);


        }




    }

    // Don't touch the code below


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