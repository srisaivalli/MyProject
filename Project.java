package Jdbc;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    ButtonGroup bg,b1,b2,b3,b4,b5,b6,b7;
    JRadioButton r1,r2,r3,c1,c2,c3,s1,s2,s3,w1,w2,m1,m2,li,lo,by,bn,h1,h2;
    JLabel l1,l,l2,l3,l4,l5,l6,l7,l8,l9,l0,la,lz,lk,b,ba,bi,lh,ld;
    JComboBox j,j1;
    JButton btn;
    
    
public Project(){
   setLayout(new GridLayout(11,3,2,5));
   setSize(300,300);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

r1=new JRadioButton("VEG");
r2=new JRadioButton("Non-Veg");
r3=new JRadioButton("Both");
c1=new JRadioButton("Yes");
c2=new JRadioButton("No");
c3=new JRadioButton("Don't know");
s1=new JRadioButton("Single");
s2=new JRadioButton("Double");
s3=new JRadioButton("Triple");
w1=new JRadioButton("Common");
w2=new JRadioButton("Attached");
m1=new JRadioButton("Yes");
m2=new JRadioButton("No");
li=new JRadioButton("Yes");
lo=new JRadioButton("No");
by=new JRadioButton("Yes");
bn=new JRadioButton("No");
h1=new JRadioButton("Boys");
h2=new JRadioButton("Girls");
lh=new JLabel("Type of Hostel");
lh.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l1=new JLabel("Food");
l1.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l=new JLabel("Gym");
l.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l2=new JLabel("Distance (from Hostel - University (apporx))");
l2.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l3=new JLabel("Sharing");
l3.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l4=new JLabel("                                              ");
l5=new JLabel("                                              ");
l6=new JLabel("Washroom");
l6.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l8=new JLabel("                                  ");
l0=new JLabel("                                   ");
lk=new JLabel("                                   ");
ld=new JLabel("                            ");
l7=new JLabel("Medical Facility");
l7.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
l9=new JLabel("Security");
l9.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
la=new JLabel("Laundry");
la.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
lz=new JLabel("                                                                                             ");
b=new JLabel("Bus Availability");
b.setFont(new Font("TimesNewRoman", Font.BOLD, 15));
ba=new JLabel("                                                                                 ");
j=new JComboBox();
j1=new JComboBox();
bi=new JLabel("        ");
btn=new JButton("Submit");
j1.addItem("19:00 hrs");
j1.addItem("20:00 hrs");
j1.addItem("21:00 hrs");
j.setBounds(100,50,100,30);
j.addItem("0.5 km");
j.addItem("1 km");
j.addItem("2 km");
j.addItem("3 km");
bg=new ButtonGroup();
b1=new ButtonGroup();
b2=new ButtonGroup();
b3=new ButtonGroup();
b4=new ButtonGroup();
b5=new ButtonGroup();
b6=new ButtonGroup();
b7=new ButtonGroup();
bg.add(r1);
bg.add(r2);
bg.add(r3);
b1.add(c1);
b1.add(c2);
b1.add(c3);
b2.add(s1);
b2.add(s2);
b2.add(s3);
b3.add(w1);
b3.add(w2);
b4.add(m1);
b4.add(m2);
b5.add(li);
b5.add(lo);
b6.add(by);
b6.add(bn);
b7.add(h1);
b7.add(h2);
add(lh);
add(h1);
add(h2);
add(ld);
add(l1);
add(r1);
add(r2);
add(r3);
add(l);
add(c1);
add(c2);
add(c3);
add(l2);
add(j);
add(l4);
add(l5);
add(l3);
add(s1);
add(s2);
add(s3);
add(l6);
add(w1);
add(w2);
add(l8);
add(l7);
add(m1);
add(m2);
add(l0);
add(l9);
add(j1);
add(lz);
add(lk);
add(la);
add(li);
add(lo);
add(ba);
add(b);
add(by);
add(bn);
add(bi);
add(btn);
this.add(btn,BorderLayout.CENTER);
btn.addActionListener(this);
j.addActionListener(this);
j1.addActionListener(this);
    
}    
    
   String str=" ";
    @Override
    public void actionPerformed(ActionEvent e) {
        String h = " "; 
         String o = " "; 
            if(h1!=null){
                if (h1.isSelected()) { 
  
                    h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                }     
                 else if (r1.isSelected()) { 
  
                  h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                 else if (r1.isSelected()) { 
  
                    h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (c1.isSelected()) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (s1.isSelected()) { 
  
                     h ="Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (w1.isSelected()) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (m1.isSelected()) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (li.isSelected()) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (by.isSelected()) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"; 
                } 
                else if (e.getSource()==j.getItemAt(0)) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"+(String)j.getSelectedItem(); 
                } 
                else if (e.getSource()==j1.getItemAt(0)) { 
  
                     h = "Pride hostel"+" \n"+"Sona boys hostel"+(String)j1.getSelectedItem(); 
                } 
                else if(e.getSource()==btn){
                    h="Pride hostel"+" \n"+"Sona boys hostel";
                }
                JOptionPane.showMessageDialog(null,h); 
             // JOptionPane.showMessageDialog(null,h); 
          }
            if(r2!=null){
                if (h1.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                
                else if (r2.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (c2.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (s2.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                } 
                else if (w2.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (m1.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (li.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (by.isSelected()) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (e.getSource()==j) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if (e.getSource()==j1.getItemAt(1)) {
                    
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                else if(e.getSource()==btn){
                    o = "Ram boys hostel"+" \n"+"Lucky boys hostel";
                }
                
                JOptionPane.showMessageDialog(null,o);
            } else {
            }
                
            
    }  
               
             

  
    public static void main(String[] args) {
        Project p=new Project();
       
    }
}
