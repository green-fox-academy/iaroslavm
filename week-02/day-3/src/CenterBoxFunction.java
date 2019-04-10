import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameter:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int [] sizes = {300, 200, 100};

        for (int size : sizes) {
            squares(size,graphics);
        }
    }

    public static void squares(int size, Graphics graphics) {

      int  color1 = 0 + (int) (Math.random()*(101 - 0));
      int  color2 = 0 + (int) (Math.random()*(101 - 0));
      int  color3 = 0 + (int) (Math.random()*(101 - 0));
      graphics.setColor(new Color(color1, color2, color3));
      graphics.fillRect(WIDTH/2 - (size/2),HEIGHT/2 - (size/2),size,size);
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