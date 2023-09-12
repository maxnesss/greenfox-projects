import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

// code need to be edited -> hexagon2.java

public class Hexagon2 {
    public static void drawImage(Graphics graphics) {
        // starting coordinates
        int startingX =(WIDTH/2)-5; // center
        int staringY= 30; // random number close to top
        // hexagon properties
        int sideSize = 10;
        int width = 20;
        int height =20;

        //top triangle
        for (int row = 0; row < 20; row++) {

            if (row<10) {
                for (int element = 0; element <= row; element++) {
                    makeHexa(startingX + (-(row * (sideSize+sideSize/2)) + (element * (sideSize*3))),
                            staringY + (row * (height/2)), graphics);
                }
            }
        }
        // middle part
        for (int row = 0; row < 17; row++) {
            if (row%2==0){

                for (int element = 0; element < 10; element++) {
                    makeHexa((startingX - (width*7-(sideSize/2)))+(element*30), height*7+(row*10),graphics);
                }
            }else {
                int startingMiddleX = 35;
                for (int element = 0; element < 9; element++) {
                    makeHexa((startingX-(6*width))+(element*30), height*7+(row*10),graphics);
                }
            }
        }
        //make bottom
        for (int row = 0; row < 20; row++) {

            if (row<10) {
                staringY = 300;
                for (int element = 9; element >= row; element--) {
                    makeHexa(20 + (-(row * 15) + (element * 30)), staringY + (row * 10), graphics);
                }
            }
        }
    }
    public static void makeHexa(int startingX, int startingY, Graphics graphics){


        int[] xPoints = {startingX,startingX+10,startingX+15,startingX+10,startingX,startingX-5};
        int[] yPoints = {startingY,startingY,startingY-10,startingY-20,startingY-20,startingY-10};
//      int[] xPoints = {20,30,35,30,20,15};
//      int[] yPoints = {35,35,25,15,15,25};
        int nPoints = 6;
        graphics.drawPolygon(xPoints, yPoints, nPoints);


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