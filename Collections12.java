
package collections;
import java.util.*;

public class Collections12 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.search(50));
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    }
}
