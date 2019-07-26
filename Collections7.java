
package collections;

import java.util.*;

public class Collections7 {
    public static void main(String[] args) {
        HashMap<Integer,String> h= new HashMap<Integer,String>();
        h.put(1,"a");
        h.put(2,"b");
        h.put(3,"c");
       // System.out.println(h);
        for(Map.Entry m:h.entrySet())
        {
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
    }
    
}
