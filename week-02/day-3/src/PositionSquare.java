import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        int sideSize = 50;
        int px = 250;
        int py = 250;
        drawSquare(px, py, sideSize, graphics);
        Color[] color = {Color.BLUE, Color.GREEN, Color.RED};

        for (int i = 0; i < 3; i++) {
            graphics.setColor(color[i]);
            drawSquare(px - i * 50, py - i * 50, sideSize, graphics);
        }
    }

    public static void drawSquare(Integer x, Integer y, Integer s, Graphics g) {
        g.drawLine(x, y, x + s, y);
        g.drawLine(x + s, y, x + s, y - s);
        g.drawLine(x + s, y - s, x, y - s);
        g.drawLine(x, y - s, x, y);

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
