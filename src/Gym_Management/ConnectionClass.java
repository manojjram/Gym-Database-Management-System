package Gym_Management;

import java.sql.*;

public class ConnectionClass {
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym_Management","root","6366");
            stm=con.createStatement();
            if(con.isClosed())
            {
                System.out.println("Connection not established");
            }
            else{
                System.out.println("Connection Established");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        new ConnectionClass();
    }
}
