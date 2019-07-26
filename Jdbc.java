package jdbc;

import java.sql.*;

public class Jdbc {

    public Jdbc(){
try{

Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver loaded");
String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
Connection con=DriverManager.getConnection(constr,"system","system");
System.out.println("Connection Established");
}catch(Exception e){System.out.println(e.getMessage());}
}

public static void main(String args[])throws Exception{

}
}
   