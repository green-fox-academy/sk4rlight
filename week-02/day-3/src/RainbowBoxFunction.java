import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color myIndigo =  new Color(29, 0, 51);
        Color myViolet = new Color(93, 51, 93);
        Color[] fillColor = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, myIndigo, myViolet};

        int i;
        int amountOfBoxes = 40;
        int lineDistance = WIDTH / amountOfBoxes;
        for (i = 0; i < amountOfBoxes; i++) {
            drawSquare(lineDistance/2, fillColor[(int)(Math.random()*fillColor.length)], graphics);
        }



    }

    public static void drawSquare(Integer s, Color color, Graphics g) {
        g.setColor(color);
        g.drawLine(W-s, H+s, W+s, H+s );
        g.drawLine(W+s, H+s, W+s, H-s );
        g.drawLine(W+s, H-s, W-s, H-s );
        g.drawLine(W-s, H-s, W-s, H+s );
        g.fillRect();
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