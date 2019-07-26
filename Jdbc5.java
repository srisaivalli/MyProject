
package jdbc;
import java.sql.*;
import java.io.*;

public class Jdbc5 {
    
    public Jdbc5(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
            int sno=7;
            String qry="delete from student where sno= "+sno;
            int c=st.executeUpdate(qry);
            if(c>0)
                System.out.println("Deleted successfully");
            else
                System.out.println("Deletion Failed");
            
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args)throws IOException {
        
        Jdbc5 jh=new Jdbc5();
        
    }
}
