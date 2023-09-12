import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        Point[] listOfPoints = new Point[]{new Point(10,10), new Point(290,10), new Point(290,290), new Point(10,290)};
        Point[] listOfPoints2 = new Point[]{new Point(50,100), new Point(70,70), new Point(80,90), new Point(90,90), new Point(100,70), new Point(120,100),new Point(85,130),new Point(50,100)};

        connectDots(listOfPoints2,graphics);
    }
    public static void connectDots(Point[] arrayOfPoints, Graphics graphics){
        for (int i = 0; i < arrayOfPoints.length -1; i++) {
            graphics.drawLine(arrayOfPoints[i].x,arrayOfPoints[i].y,arrayOfPoints[i+1].x,arrayOfPoints[i+1].y);

        }

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