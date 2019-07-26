
package jdbc;
import java.awt.Event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Swingjdbc extends JFrame implements ActionListener{
    
    JLabel l1;
    JTextField tf;
    JButton btn;
    JPanel p;
    JTextArea ta;
    
    public Swingjdbc(){
        l1=new JLabel("Table Name");
        tf=new JTextField(10);
        btn=new JButton("Submit");
        ta =new JTextArea(5,5);
        p=new JPanel();
        p.add(l1);p.add(tf);p.add(btn);
        add(p,"North");
        add(ta);
        setSize(400,400);
        setVisible(true);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        ta.setText(" ");
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
            Connection con=DriverManager.getConnection(constr,"system","system");
            Statement st=con.createStatement();
                String qry="select * from "+tf.getText();
                ResultSet rs=st.executeQuery(qry);
                ResultSetMetaData rsm=rs.getMetaData();
                while(rs.next()){
                    for(int i=1;i<=rsm.getColumnCount();i++)
                        ta.append(rs.getString(i)+"\t");
                        ta.append("\n");
                }
              }catch(Exception es){System.out.println(es.getMessage());}
}
    public static void main(String[] args) {
        Swingjdbc s=new Swingjdbc();
    }
}
