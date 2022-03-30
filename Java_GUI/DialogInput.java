package Java_GUI;

import javax.swing.*;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the show input dialog box
 */

public class DialogInput {
//    creating the main method
    public static void main(String[] args){
//        creating an instance of the JFrame class
        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(frame,    "Welcome " + name);
    }
}
