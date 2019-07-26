
package collections;

import java.util.*;

public class Collections3 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        l.add("two");
        l.add("three");
        l.add("five");
        System.out.println(l);
        l.addFirst("one");
        System.out.println(l);
        l.addLast("six");
        System.out.println(l);
        l.add(3,"four");
        System.out.println(l);
        Iterator it= l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
    
}
