// not working



import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {
    public static void drawImage(Graphics graphics){
    int size = 200;

    drawSq(200,200,size,graphics );

    }
    public static void drawSq(int x, int y, int size, Graphics graphics){
        if (size<5) return;


        graphics.fillRect(x,y,size,size);
        // top
        makeTop(x, y, size, graphics);


        //mid
        graphics.fillRect(x/3,y+(size/3),size/3,size/3);
        graphics.fillRect(x*2+(size/3),y+(size/3),size/3,size/3);

        //bottom
        graphics.fillRect(x/3,y*2+(size/3),size/3,size/3);
        graphics.fillRect(x+(size/3),y*2+(size/3),size/3,size/3);
        graphics.fillRect(x*2+(size/3),y*2+(size/3),size/3,size/3);

        drawSq(x/3,y/3,size/3,graphics);



    }
    public static void makeTop(int x, int y, int size, Graphics graphics){
        if (size<5) return;

        graphics.fillRect(x/3,y/3,size/3,size/3);
        graphics.fillRect(x+(size/3),y/3,size/3,size/3);
        graphics.fillRect(x*2+(size/3),y/3,size/3,size/3);

        makeTop(x/3, y/3, size/3, graphics);

    }



    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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