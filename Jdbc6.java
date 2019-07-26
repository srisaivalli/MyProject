
package jdbc;
import java.sql.*;
import java.io.*;

public class Jdbc6 {
    public Jdbc6(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
            int sno=5;
            String name="valli";
            int rollno=58;
            String qry="Update student set name='"+name+"',rollno='"+rollno+"'where sno="+sno;
            int c=st.executeUpdate(qry);
            if(c>0)
                System.out.println("Updated successfully");
            else
                System.out.println("Updation Failed");
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args)throws IOException {
        
        Jdbc6 jd=new Jdbc6();
    }
    
}
