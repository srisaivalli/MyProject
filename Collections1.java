
package collections;
import java.util.*;

class Student{
    int sno;
    String sname;
    int marks;
    
    public Student(int sno,String sname,int marks){
        
        this.sno=sno;
        this.sname=sname;
        this.marks=marks;
    }
}
public class Collections1 {
    public static void main(String[] args) {
        
        Student s=new Student(101,"a",55);
        Student s1=new Student(102,"b",60);
        Student s2=new Student(103,"c",74);
        Student s3=new Student(104,"d",16);
        ArrayList arr=new ArrayList();
        arr.add(s);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        for(int i=0;i<arr.size();i++)
        {
            Student sr=(Student)arr.get(i);
            System.out.println(sr.sno+"\t"+sr.sname+"\t"+sr.marks);
            
        }
    }
    
}
