package test;

import javax.swing.*;
import java.awt.*;

public class MainApp {
    MainApp(){


    }
    public void initMain(){
        // new frame
        JFrame frame = new JFrame("Max Bank App");
        //size of new frame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);
        JButton btn1 = new JButton("test");
        btn1.setBounds(50,50,100,100);
        frame.add(btn1);




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops running hen closed
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
