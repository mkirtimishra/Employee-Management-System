package com.employee;
import java.sql.*;
public class Conn {
    public Connection c;
    public Statement s;

    public Conn(){
        try{
           // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployee","root","k#rt#9005");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}