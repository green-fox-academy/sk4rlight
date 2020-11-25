import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = HEIGHT/4;
        int y = WIDTH/8;
        Color[] colorsArray = {
                Color.BLUE, Color.GREEN, Color.BLUE, Color.GRAY
        };
        for (int i = 0; i < 4 ; i ++){
            rectangles(x * i, y * i, colorsArray[i], graphics);
        }


    }

        public static void rectangles(Integer x, Integer y, Color color, Graphics g) {
            g.setColor(color);
            g.drawLine(0,0, 0, y);
            g.drawLine(0,y, x, y);
            g.drawLine(x,y, x, 0);
            g.drawLine(x,0, 0, 0);
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