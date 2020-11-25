import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.GRAY);
        graphics.drawLine(MARGIN, MARGIN, MARGIN, HEIGHT-MARGIN);
        graphics.setColor(Color.RED);
        graphics.drawLine(MARGIN, HEIGHT-MARGIN, WIDTH-MARGIN, HEIGHT-MARGIN);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(WIDTH-MARGIN, HEIGHT-MARGIN, WIDTH-MARGIN, MARGIN);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH-MARGIN, MARGIN, MARGIN, MARGIN);

    }

    // Don't touch the code below
    static int MARGIN = 20;
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