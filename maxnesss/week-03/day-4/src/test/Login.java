package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {

        // new frame
        JFrame frame = new JFrame("Max Bank App");
        //size of new frame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops running hen closed
        frame.setLayout(null);
        frame.setVisible(true);

        // logo
        Icon img = new ImageIcon("assets/logo.png");
        JLabel logo;
        logo = new JLabel(img);
        logo.setBounds(450,0,500,500);
        // login label
        JLabel loginLabel = new JLabel("login");
        loginLabel.setBounds(530,520,100,30);
        // login field
        JTextField login = new JTextField();
        login.setBounds(500,550,100,30);
        // password label
        JLabel passwordLabel = new JLabel("password");
        passwordLabel.setBounds(820,520,100,30);
        // password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(800,550,100,30);
        // enter button
        JButton enterBtn =new JButton("enter");
        enterBtn.setBounds(650,650,100,30);
        // new user button
        JButton newUserBtn =new JButton("new user");
        newUserBtn.setBounds(650,700,100,30);


        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
                MainApp main = new MainApp();
                main.initMain();
                frame.dispose();
            }
        };
        enterBtn.addActionListener(l);


        Color backgroundColor = new Color(230,230,230);
        frame.getContentPane().setBackground(backgroundColor);

    frame.add(loginLabel);
    frame.add(enterBtn);
    frame.add(newUserBtn);
    frame.add(logo);
    frame.add(passwordField);
    frame.add(login);
    frame.add(passwordLabel);




    }

}
