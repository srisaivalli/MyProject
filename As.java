/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.util.*;

public class As {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push("valli");
        System.out.println(s.peek());
        s.pop();
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
}
