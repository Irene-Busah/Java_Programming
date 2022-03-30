package Java_Database;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import javax.swing.text.DefaultEditorKit;
import java.sql.*;
import java.util.Scanner;

public class StudentInsert {
    public static  void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);

        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "");
            Statement mySt = myConn.createStatement();

//            System.out.print("\nEnter your lastname: ");
//            String lname = keyboardInput.nextLine();
//
//            System.out.print("\nEnter your firstname: ");
//            String fname = keyboardInput.nextLine();
//
//            System.out.print("\nEnter your address: ");
//            String address = keyboardInput.nextLine();

//            System.out.print("\nEnter the city of your address: ");
            String sql = "INSERT INTO `students` (`Lastname`, `Firstname`, `Address`, `City`) VALUES ('Busah',  'Irene', 'Kicukiro', 'Kigali')";

            mySt.executeUpdate(sql);
            System.out.println("Successfully inserted the data");

//            retrieving the data
            ResultSet myRe = mySt.executeQuery("select * from students");
            while (myRe.next()) {
                System.out.println(myRe.getString("Person_ID") + "   " + myRe.getString("LastName") + "    " +
                        myRe.getString("FirstName") + "   " + myRe.getString("Address") + "    " + myRe.getString("City"));

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
