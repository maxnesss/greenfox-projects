import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal {
    public static void drawImage(Graphics graphics){
        drawcross(0,0,WIDTH,HEIGHT,graphics);

    }

    public static void drawcross(int startX, int startY, int width, int height, Graphics graphics){
        if (Math.min(width, height)<4) return;

        //horizontal
        graphics.drawLine(startX,startY+height/3,startX+width,startY +height/3);
        graphics.drawLine(startX, startY + (height*2)/3,startX+width,startY + (height*2)/3);
        //vertical
        graphics.drawLine(startX+width/3,startY,startX+(width/3),startY+ height);
        graphics.drawLine(startX+width*2/3,startY,startX+(width*2/3),startY+height);

        //top left recursion
        drawcross(startX,startY,width/3,height/3,graphics);

        //top right recursion
        drawcross(startX+(width*2/3),startY,width/3,height/3,graphics);

        //bottom right recursion
        drawcross(startX,startY+(height*2/3),width/3,height/3,graphics);

        //bottom left recursion
        drawcross(startX+(width*2/3),startY+(height*2/3),width/3,height/3,graphics);

        //central
        drawcross(startX+(width/3),startY+(height/3),width/3,height/3,graphics);

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