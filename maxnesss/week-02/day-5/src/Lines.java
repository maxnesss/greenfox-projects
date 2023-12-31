import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lines {
    public static void drawImage(Graphics graphics) {

        for (int i = 0; i < 32; i++) {
            graphics.setColor(Color.GREEN);

            makeLines(0,i*10,i*10,HEIGHT,graphics);
        }
        for (int i = 0; i < 32; i++) {
            graphics.setColor(Color.RED);
            makeLines(WIDTH,i*10,i*10,0,graphics);
        }
    }
public static void makeLines(int startX, int startY, int endX, int endY, Graphics graphics){
        graphics.drawLine(startX,startY,endX,endY);
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