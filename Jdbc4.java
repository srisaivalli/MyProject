package jdbc;

import java.sql.*;
import java.io.*;
public class Jdbc4 {
    public Jdbc4(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
            int sno=7;
            String str="Atsar";
            int rollno=65;
           PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
           pst.setInt(1,7);
           pst.setString(2,"Atsar");
           pst.setInt(3,65);
            int c=pst.executeUpdate();
            if(c>0)
                System.out.println("Inserted successfully");
            else
                System.out.println("Insertion Failed");
            
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args)throws IOException {
        Jdbc4 jb=new Jdbc4();
    }
}
