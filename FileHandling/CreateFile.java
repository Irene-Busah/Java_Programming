package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the file handling concept in Java
 */

public class CreateFile {
    //    creating the main method to run the code
    public static void main(String args[]) throws IOException {
            File myFile = new File("/home/irene-busah/IdeaProjects/Java_Learning_Projects/src/FileHandling/name.txt");
//            FileWriter myfileWrite = new FileWriter("/home/irene-busah/IdeaProjects/Java_Learning_Projects/src/FileHandling/names.txt");
//
//            myfileWrite.write("1. Irene\n2. Mercy\n3. Micheal\n4. Nelson\n5. Mary\n6. Nick");
//            myfileWrite.close();
//            System.out.println("Successfully wrote to the file");

//            =============================== reading from a file =============================
//            Scanner myFileRead = new Scanner(myFile);
//            while (myFileRead.hasNextLine()){
//                String data = myFileRead.nextLine();
//                System.out.println(data);
//            }
//            System.out.println(myFile.getAbsolutePath());
//            myFileRead.close();
//
//        }
//        catch (IOException e){
//            System.out.println("An error occurred");
//            e.printStackTrace();
//        }
//    }

//            =================================== getting file info =============================
            if (myFile.exists()) {
                System.out.println("File name: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("Write mode: " + myFile.canWrite());
                System.out.println("Read mode: " + myFile.canRead());
                System.out.println("File size: " + myFile.length());
            } else {
                System.out.println("File does not exist");
            }
        }
    }
