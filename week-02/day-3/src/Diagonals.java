import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        /*
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, HEIGHT, WIDTH, 0);
        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH, HEIGHT, 0, 0);
        */
        int xa1 = 0;
        int ya1 = HEIGHT;
        int xa2 = WIDTH;
        int ya2 = 0;            // first line's coordinates (a)
        int xb1 = WIDTH;
        int yb1 = HEIGHT;
        int xb2 = 0;
        int yb2 = 0;            // second line's coordinates (b)

        int[] coordinateArray = {xa1, ya1, xa2, ya2, xb1, yb1, xb2, yb2};

        graphics.setColor(Color.RED);
        graphics.drawLine(xa1, ya1, xa2, ya2);

        if (xb1 == WIDTH && yb1 == HEIGHT && xb2 == 0 && yb2 == 0) {
            graphics.setColor(Color.GREEN);
        } else {

        }

        graphics.drawLine(xb1, yb1, xb2, yb2);

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