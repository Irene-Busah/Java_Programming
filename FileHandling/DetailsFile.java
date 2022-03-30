package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a program that picks name, telephone number and DOB and saves them in a
 * file of your choice
 */

public class DetailsFile {
//    creating the main method to run the code
    public static void main(String[] args) throws IOException {
        Scanner keyboardInput = new Scanner(System.in);
        BufferedWriter detailsDoc = new BufferedWriter(new FileWriter("/home/irene-busah/IdeaProjects/Java_Learning_Projects/src/FileHandling/names.txt", true));
        System.out.print("Enter your name: ");
        String name = keyboardInput.nextLine();

        System.out.print("Enter your telephone number: ");
        String number = keyboardInput.nextLine();

        System.out.print("Enter your date of birth(dd-mm-yy): ");
        String DOB = keyboardInput.nextLine();


        detailsDoc.write(String.format("\n\nName: %s\nTelephone Number: %s\nDate of Birth: %s", name, number, DOB));
        detailsDoc.close();
        System.out.println("Successfully wrote to the file");
    }
}
