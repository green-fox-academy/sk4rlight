import javax.swing.*;
import javax.swing.text.Highlighter;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(new Color(46, 122, 45));
        graphics.drawLine(20, 20, 700, 100);
        graphics.setColor(Color.RED);
        graphics.fillRect(40, 40, 600, 300);

        // X1 = 20;700
        // X2 = 700;700
        // X3 = width / 2; (680/2) * srqt(3)

        int[] xPoints = {20, 700, WIDTH / 2};
        int[] yPoints = {700, 700, HEIGHT - (int) ((Math.sqrt(3) * (680 / 2)) + 20)};
        graphics.drawPolygon(xPoints, yPoints, 3);
        System.out.println(yPoints[2]);

        // Draw arc
        graphics.drawArc(100, 100, 300, 600, 0, 90);
        /*graphics.drawArc(100,100, 300,  600, 20, 70);*/

    }

    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

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
            this.setBackground(Color.WHITE);
            mainDraw(graphics);
        }
    }
}
