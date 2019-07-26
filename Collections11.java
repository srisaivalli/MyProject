
package collections;
import java.util.*;
import java.util.ArrayList;

public class Collections11 {
    public static void main(String[] args)throws Exception {
        Random r=new Random();
        ArrayList ar=new ArrayList();
        int i=0;
        while(i<10){
            
           int n=r.nextInt(20);
            if(!ar.contains(n))
            {
                ar.add(n);
                i++;
            }
        }  
        Collections.sort(ar);
            
            for(i=0;i<10;i++)
            {
                System.out.print(ar.get(i));
            }
        }
}

