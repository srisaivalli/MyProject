
package collections;

import java.util.*;
public class Collections6 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("b");
        h.add("c");
        System.out.println(h);
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(5);
        t.add(2);
        t.add(4);
        t.add(1);
        t.add(3);
       // System.out.println(t);
        Iterator i=t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
    }
}
