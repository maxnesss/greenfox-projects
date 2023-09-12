import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawImage(Graphics graphics) {
        for (int i = 0; i < 19; i++) {
            makeSquare(i*10,i*10,graphics);


        }

    }
    public static void makeSquare(int x, int y, Graphics graphics) {
        int size = 10;
        graphics.setColor(new Color(128,0,128));
        graphics.fillRect(x+1,y+1,size-1,size-1);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x,y,size,size);

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