
package collections;

import java.util.*;

public class Collections5 {
    
    public static void main(String[] args) {
        
         Vector<String> v=new Vector<String>(5);
         v.addElement("a");
         v.addElement("b");
         v.addElement("c");
         v.addElement("d");
         System.out.println(v.capacity());
        // System.out.println(v.contains(c));
         System.out.println(v.size());
         v.addElement("e");
         v.addElement("f");
         v.addElement("g");
         System.out.println(v.size());
         System.out.println(v.capacity());
         Iterator it= v.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());
         }
        
    }
    
}
