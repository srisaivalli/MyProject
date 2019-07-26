
package jdbc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Swinginsert extends JFrame implements ActionListener {

    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton btn;
    public Swinginsert(){
        
        l1=new JLabel("sno");
        l2=new JLabel("name");
        l3=new JLabel("rollno");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        btn=new JButton("Insert");
        setLayout(new GridLayout(4,2));
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(btn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        pack();
        btn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String constr="jdbc:oracle:thin:@upes-500060228.DDN.UPES.AC.IN:1521:XE";
        Connection con=DriverManager.getConnection(constr,"system","system");
        Statement st=con.createStatement();
        int sno=Integer.parseInt(t1.getText());
        String name=t2.getText();
        int rollno=Integer.parseInt(t3.getText());
        String qry="insert into student values("+sno+",'"+name+"','"+rollno+"')";
        int c=st.executeUpdate(qry);
        if(c>0)
            JOptionPane.showMessageDialog(null,"Inserted successfully......");
        else
            JOptionPane.showMessageDialog(null,"Insertion Failed......");
        con.close();
        
    }catch(Exception es){System.out.println(es.getMessage());}    
    }
    
    public static void main(String[] args) {
        Swinginsert s=new Swinginsert();
    }
}
