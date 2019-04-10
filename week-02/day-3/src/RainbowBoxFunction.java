import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int color1 = 0;
        int color2 = 0;
        int color3 = 0;
        int size = HEIGHT;

        for (int i = size; i > 1; i--) {
            color1 = 0 + (int) (Math.random()*(101 - 0));
            color2 = 0 + (int) (Math.random()*(101 - 0));
            color3 = 0 + (int) (Math.random()*(101 - 0));
            Color newColor = new Color(color1, color2, color3);


            rainbow(i, newColor, graphics);
        }
    }

    public static void rainbow(int i, Color newColor, Graphics graphics) {

        graphics.setColor(newColor);
        graphics.fillRect(WIDTH/2 - (i/2),HEIGHT/2 - (i/2),i,i);

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