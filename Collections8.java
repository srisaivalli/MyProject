
package collections;

import java.util.*;

public class Collections8 {
    public static void main(String[] args) {
        TreeMap<Integer,String> t=new TreeMap<Integer,String>();
        t.put(1,"a");
        t.put(4, "d");
        t.put(2,"b");
        t.put(3,"c");
        t.put(5, "e");
        for(Map.Entry m:t.entrySet()){
            
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
    }
    
}
