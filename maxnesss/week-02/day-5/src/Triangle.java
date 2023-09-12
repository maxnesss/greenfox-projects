import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void drawImage(Graphics graphics) {

        int sizeOfTriangle = 16;


        for (int element = 0; element < 20; element++) {
            for (int row = 0; row < 20-element; row++) {
                makeTriangle(element*sizeOfTriangle+(row*sizeOfTriangle/2),HEIGHT-(row*sizeOfTriangle),graphics);
            }
        }

    }
    public static void makeTriangle(int x, int y, Graphics graphics){
        graphics.drawLine(x,y,x+16,y);
        graphics.drawLine(x+16,y,x+8,y-14);
        graphics.drawLine(x+8,y-14,x,y);

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