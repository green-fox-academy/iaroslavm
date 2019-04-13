import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squarefail {

    static int WIDTH = 729;
    static int HEIGHT = 729;
    static int XSTART = 0;
    static int YSTART = 0;

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.

        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

//        ds1(WIDTH/3, 0, WIDTH, graphics);
//        ds1(WIDTH/3, HEIGHT/3, WIDTH/3, graphics);
        ds2(0, 0, WIDTH, HEIGHT, graphics);


    }

    public static void ds2(int x, int y, int width, int height, Graphics g) {

        g.setColor(Color.black);
        g.drawRect(x + width / 3,y ,width / 3,width / 3);
        g.drawRect(x + width * 2/ 3,y + width / 3,width / 3,width / 3);
        g.drawRect(x + width / 3,y + width *2 / 3,width / 3,width / 3);
        g.drawRect(x ,y + width  / 3,width / 3,width / 3);

    }


//    public static void ds1(int x, int y, int size, Graphics g) {
//
//        g.setColor(Color.black);
//        g.drawRect(x,y,size,size);
//
//        if (size >= 3) {
//
//            //top square
//            ds1(x, y, size / 3, g); // one third from the 0 0 coordinates
//            //right square
//
//
//
//        }
//
//    }

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