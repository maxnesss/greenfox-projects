import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Star {
    public static void drawImage(Graphics graphics) {
        toHalfs(graphics);




        //right top corner
        for (int i = 0; i < HEIGHT/20; i++) {
            makeLines(160,i*10,i*10 +160,HEIGHT/2,graphics);
        }

        //bottom left
        for (int i = 0; i < WIDTH/20; i++) {
            makeLines(WIDTH/2,i*10+160,i*10,160,graphics);
        }

        // left top corner
        for (int i = 0; i < HEIGHT/20; i++) {
            makeLines(160,i*10,160-(i*10),160,graphics);
        }
        //right top corner
        for (int i = 0; i < HEIGHT/20; i++) {
            makeLines(320-(i*10),160,160,i*10+160,graphics);
        }











    }
    public static void makeLines(int startX, int startY, int endX, int endY, Graphics graphics){
        graphics.drawLine(startX,startY,endX,endY);
    }
    public static void toHalfs(Graphics graphics){
        // horizontal
        graphics.drawLine(0,HEIGHT/2,WIDTH,HEIGHT/2);
        // vertical
        graphics.drawLine(WIDTH/2,0,WIDTH/2,HEIGHT);

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