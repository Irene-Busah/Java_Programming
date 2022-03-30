package Java_GUI;

import javax.swing.*;

/**
 * @ AUTHOR: Irene Busah
 * This file accept input from the user and sums them up and display the output
 */

public class DialogInput_Sum {
//    creating the main method
    public static void main(String[] args){
        JFrame frame = new JFrame();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter a number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter another number: "));
        int sum = num1 + num2;
        JOptionPane.showMessageDialog(frame, "The sum is " + sum);
    }
}
