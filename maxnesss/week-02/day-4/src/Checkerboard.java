import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern

        for (int y = 0; y < HEIGHT ; y++) {
            for (int x = 0; x < WIDTH; x++) {
                if(y%2==0) {
                    makeSquare(x * 20, y * 10, graphics);
                } else {
                    makeSquare(x * 20+10, y * 10, graphics);
                }
            }
        }
    }
    public static void makeSquare(int x, int y, Graphics graphics){
        int size = 10;
        graphics.fillRect(x,y,size,size);
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