import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int size = 0;
        int x = 0;
        int y = 0;

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);


        int [][][] newColor = {{{200,200,200}},{{211,211,211}},{{192,192,192}},{{128,128,128}}};

        System.out.println(Arrays.toString(newColor[0]));

        List<Integer> color1 = new ArrayList<>(Arrays.asList(200,211,192,128));
        List<Integer> color2 = new ArrayList<>(Arrays.asList(200,211,192,128));
        List<Integer> color3 = new ArrayList<>(Arrays.asList(200,211,192,128));
        int colorI = 0;

        for (int i = 0; i < 600; i++){
            size = 0 + (int) (Math.random()*(5 - 0));
            x = 0 + (int) (Math.random()*(320 - 0));
            y = 0 + (int) (Math.random()*(320 - 0));
            colorI = 0 + (int) (Math.random()*(4 - 0));
            Color nColor = new Color(color1.get(colorI),color2.get(colorI),color3.get(colorI));
            graphics.setColor(nColor);
            graphics.fillRect(x,y,size,size);

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