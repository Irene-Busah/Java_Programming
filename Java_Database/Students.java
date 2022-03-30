package Java_Database;
import java.sql.*;


public class Students {
    //    creating the main method to run the program
    public static void main(String[] args) {
        try {
//            creating connection to the database
            //1. Get a connection to the database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "");
//2. Create a statement
            Statement mySt = myConn.createStatement();
//3. Execute SQL
            ResultSet myRe = mySt.executeQuery("select * from students");

//4. Process result set
            while (myRe.next()) {
                System.out.println(myRe.getString("LastName") + "    " +
                        myRe.getString("FirstName") + "   " + myRe.getString("Address") + "    " + myRe.getString("City"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
