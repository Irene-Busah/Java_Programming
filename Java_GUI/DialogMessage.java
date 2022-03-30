package Java_GUI;

import javax.swing.*;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of Java GUI: JOptionPane showMessageDialog
 */

public class DialogMessage {
//    creating the main method
    public static void main(String[] args){
//        creating an instance of the JFrame class
        JFrame frame = new JFrame("Welcome Message");
//        creating a message dialog box
//        JOptionPane.showMessageDialog(frame, "Welcome to Irene Institute of Technology");


//        ==================================== Displaying an alert or warning ==================================
        JOptionPane.showMessageDialog(frame, "Virus detected.", "Alert", JOptionPane.WARNING_MESSAGE);


//        =================================== Displaying confirm dialog =============================
        JOptionPane.showConfirmDialog(frame, "Do you want to delete this file?");
    }
}
