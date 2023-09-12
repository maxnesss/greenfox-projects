import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void drawImage(Graphics graphics){
        //to call fnc
        makeHexa((WIDTH/2)-(WIDTH/4),HEIGHT,300,graphics);

    }

    public static void makeHexa(int startingX, int startingY,int size, Graphics graphics){
        int sideSize = 10;
        if (size<5) return;

        int[] xPoints = {startingX,startingX+size,startingX+(size+(size/2)),startingX+size,startingX,startingX-(size/2)};
        int[] yPoints = {startingY,startingY,startingY-size,startingY-(size*2),startingY-(size*2),startingY-size};

        int nPoints = 6;
        graphics.drawPolygon(xPoints, yPoints, nPoints);

        //bottom left
        makeHexa(startingX,startingY,size/2,graphics);

        //top
        makeHexa(startingX,startingY-size,size/2,graphics);

        //right
        makeHexa(startingX+((size / 4) * 3),startingY-(size/2),size/2,graphics);




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