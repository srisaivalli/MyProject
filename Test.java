package jdbc;
import java.sql.*;  
public class Test{  
public Test(){  
 try{  
   String url="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";  
   Class.forName("oracle.jdbc.driver.OracleDriver");  
   Connection c=DriverManager.getConnection(url);  
   Statement st=c.createStatement();  
   ResultSet rs=st.executeQuery("select * from login");  
    
   while(rs.next()){  
    System.out.println(rs.getString(1));  
   }  
  
}catch(Exception ee){} } 

    public static void main(String args[]){
     
     Test t=new Test();
 }
}
