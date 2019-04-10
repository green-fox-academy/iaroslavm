import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int size = 10;
        int x = 5;
        int y = 5;

        for (int i = 0; i < 6; i++) {
            if (i > 0) {
                x += size;
                y += size;
                size = (int) (size * 3/2);
            }
            steps3d(x,y,size,graphics);
        }


    }

    public static void steps3d( int x, int y, int size, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x,y,size,size);
        graphics.setColor(new Color(147,112,219));
        graphics.fillRect(x,y,size,size);



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