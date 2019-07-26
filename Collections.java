package collections;
import java.util.*;

public class Collections {
    
    public static void main(String[] args) {
        
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("one");
        arr.add("two");
        arr.add("four");
        arr.add("five");
        System.out.println(arr);
        arr.add(2,"three");
        arr.remove("four");
        System.out.println(arr);
        System.out.println(arr.contains("two"));
        System.out.println(arr.get(3));
        System.out.println(arr.size());
       // arr.clear();
        //System.out.println(arr.size());
      /*  for (int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
        */
      Iterator it=arr.iterator();
      while(it.hasNext())
      {
          System.out.println(it.next());
      }
       
    }

    static void sort(ArrayList ar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
