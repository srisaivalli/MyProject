
package collections;
import java.util.*;

class Student1{
    public int sno;
    public String sname;
    public int marks;
    
    public Student1(int sno,String sname,int marks){
         
        this.sno=sno;
        this.sname=sname;
        this.marks=marks;

    }
    
}
public class Collections9 {
    public static void main(String[] args) {
    
        Student1 s=new Student1(1,"a",47);
        Student1 s1=new Student1(2,"b",55);
        Student1 s2=new Student1(3,"d",45);
        Student1 s3=new Student1(4,"d",85);
        ArrayList ar=new ArrayList();
        ar.add(s);
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        TreeMap<Integer,Object> t=new TreeMap<Integer,Object>();
        for(int i=0;i<ar.size();i++){
            
            Student1 se=(Student1)ar.get(i);
            t.put(se.marks,ar.get(i));
        }
         for(Map.Entry m:t.entrySet()){
             
             Student1 sa=(Student1)m.getValue();
             System.out.println(sa.sno+"\t"+sa.sname+"\t"+sa.marks);
         }    
    
    
    }
    
    
}
