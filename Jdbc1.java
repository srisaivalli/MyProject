
package jdbc;
import java.sql.*;
public class Jdbc1 {
    public Jdbc1(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:Oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
            String qry="select * from student";
            ResultSet rs=st.executeQuery(qry);
            while(rs.next()){
                System.out.print(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n");
               //   System.out.println(rs.getString(rs.next());
            }
            
       }catch(ClassNotFoundException | SQLException e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args)throws Exception {
        Jdbc1 jc=new Jdbc1();
    }
}
