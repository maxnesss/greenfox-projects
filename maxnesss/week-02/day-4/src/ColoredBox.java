import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge
        // top
        graphics.setColor(new Color(255,0,0));
        graphics.drawLine(30,30,290,30);
        // right
        graphics.setColor(new Color(0,255,0));
        graphics.drawLine(290,30,290,290);
        // bottom
        graphics.setColor(new Color(0,0,255));
        graphics.drawLine(290,290,30,290);
        // left
        graphics.setColor(new Color(255,0,255));
        graphics.drawLine(30,290,30,30);



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
            drawImage(graphics);
        }
    }
}