import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


// script starts goes to main method, main method refers to ImagePanel class that calls mainDraw method that takes Graphic

public class LineInTheMiddle {                                             // this is the main class
    public static void mainDraw(Graphics graphics){             //this is the imported method or not???
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0,0,0,HEIGHT/2);
        graphics.setColor(Color.RED);
        graphics.drawLine(0,0,WIDTH/2,0);


    }

    // Don't touch the code below
    static int WIDTH = 500 ;
    static int HEIGHT = 500;

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

    static class ImagePanel extends JPanel {                              //this is an additional class
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);                                          // mainDraw is called here, created above
        }
    }
}