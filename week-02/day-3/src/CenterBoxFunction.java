import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.
        int squareSize = 25;

        for (int i = 1; i < 4; i++) {
            drawSquare(squareSize * i, graphics);
        }

    }

        public static void drawSquare (Integer s, Graphics g) {
            g.drawLine(W-s, H+s, W+s, H+s );
            g.drawLine(W+s, H+s, W+s, H-s );
            g.drawLine(W+s, H-s, W-s, H-s );
            g.drawLine(W-s, H-s, W-s, H+s );
        }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    static int W = WIDTH/2;
    static int H = HEIGHT/2;

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