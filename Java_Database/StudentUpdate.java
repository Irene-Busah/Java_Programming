package Java_Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
    public static void main(String[] args) {
        try{
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "");
        Statement mySt = myConn.createStatement();
        String sql = "UPDATE `students` SET Lastname = 'Anto', Firstname = 'Margaret', Address ='Bibiani NHIS', City = 'Bibiani' WHERE Person_ID = 1";
        mySt.executeUpdate(sql);
        System.out.println("Successful");
    } catch (Exception e){
            e.printStackTrace();
        }
    }
}
