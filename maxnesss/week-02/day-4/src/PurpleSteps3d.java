import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        int sizeOfSQ = 30;
        int xCord = 30;
        for (int i = 1; i < 9; i++) {

            makeSquare(sizeOfSQ,xCord,xCord,graphics);
            xCord = xCord + sizeOfSQ;
            sizeOfSQ+=30;

        }


    }
    public static void makeSquare(int size, int x, int y, Graphics graphics){
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