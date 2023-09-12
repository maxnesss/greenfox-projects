import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.

        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] colors = new Color[]{Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,Color.PINK,Color.DARK_GRAY};


        for (int i = 1; i <= colors.length; i++) {
            makeColoredSquare(i*10,colors[i-1], graphics);



        }
//        int size = 50;
//        for (Color i : colors){
//            makeColoredSquare(size,i, graphics);
//            size += 10;
//
//        }
//        makeColoredSquare(50,Color.PINK, graphics);
//        makeColoredSquare(100,Color.GREEN,graphics);


    }
    public static void makeColoredSquare(int size, Color color, Graphics graphics){

        graphics.setColor(color);
        graphics.drawRect(WIDTH/2-size/2,HEIGHT/2-size/2,size,size);
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