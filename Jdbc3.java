
package jdbc;
import java.sql.*;

public class Jdbc3 {
    public Jdbc3(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
            String qry="select * from student";
            ResultSet rs=st.executeQuery(qry);
            ResultSetMetaData rsm=rs.getMetaData();
            int noc=rsm.getColumnCount();
            String head=" ";
            for(int j=1;j<=noc;j++)
                head=head+rsm.getColumnName(j)+"\t";
            System.out.println(head);
            System.out.println("-------------------------------------");
            while(rs.next())
            {
                for(int i=1;i<=noc;i++)
                    System.out.println(rs.getString(i)+"\t");
                System.out.println(" ");
            }
            
        }catch(Exception e){System.out.println(e.getMessage());}
    }
    public static void main(String[] args)throws Exception {
        
        Jdbc3 je=new Jdbc3();
        
    }
}
