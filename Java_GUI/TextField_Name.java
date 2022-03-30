package Java_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ AUTHOR: Irene Busah
 * This file implement the concept text field
 */

public class TextField_Name {
//    creating the main method
    public static void main(String[] args){
        JFrame frame = new JFrame();

        JTextField t1, t2;
        t1 = new JTextField("Your name: ");
        t1.setBounds(50, 100, 200, 30);
//        t2 = new JTextField("Enter your second name: ");
//        t2.setBounds(50, 150, 200, 30);

        JButton button = new JButton("Click me!");
        button.setBounds(50, 150, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                t1.setText("Welcome");
                String name = t1.getText();
                JOptionPane.showMessageDialog(frame, name);

            }
        });
        frame.add(t1);
//        frame.add(t2);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
