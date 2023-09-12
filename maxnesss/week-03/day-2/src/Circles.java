import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void drawImage(Graphics graphics){
        //to call fnc
        makeCircle(0,0,WIDTH,graphics);

    }
    public static void makeCircle(int x, int y,int size, Graphics graphics){
        graphics.drawRoundRect(x,y,size,size,size,size);

        graphics.drawRoundRect(x +(size*1/4),y,size/2,size/2,size/2,size/2);
        //graphics.drawRoundRect(x+size,y,size/2,size/2,size/2,size/2);
        //graphics.drawRoundRect(x+size,y,size/2,size/2,size/2,size/2);

    }



    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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