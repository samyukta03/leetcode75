/*
 * Isomorphic strings: Consider two strings s and t
 * If each character in s is matched to one char from t ie) s can be replaced with t then its isomorphic 
 * Else not
 * EG)i) s = paper and t = title :
        p -> t / a ->  i / p -> t / e-> l / r-> e
        Since none of s char has more than one mapping they are isomorphic 
* EG)ii) s= foo and t = bar
        f->b / o-> a, r
        Since o has two mapping its not isomorphic
* EG)iii) s = badc and t = baba
        b-> b / a->a / d->b / c->a
        Since b is mapped to b and d and a is mapped to a and c they are not isomorphic
 */
import java.util.HashMap;
import java.util.Scanner;

public class isomorphic_Strings {
    //-----Soln: TC: O(n) SC ? 
    public boolean isISomorphic(String s, String t){
        boolean flag = true ;
        HashMap<Character,Character>m = new HashMap<Character,Character>();
        if(s.length()!=t.length()) return false;
        else if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
        //if the map doesn't contain the char in the s string as well as doesn't contain the char at t string, insert into map
        // or if the map contains the char in s string, and the t string char is same as the value for the key(s str char) insert into map
                if((m.containsKey(s.charAt(i))==false && m.containsValue(t.charAt(i))==false ) || 
    (m.containsKey(s.charAt(i))==true && m.get(s.charAt(i))==t.charAt(i))  )
                {
                    m.put(s.charAt(i),t.charAt(i));
                }
        //else if the map contains a key with more than one value return false
        //or if the map doest contain the s string char at key and doesn't contain the t string char at value return false
                else 
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner inst = new Scanner(System.in);
        String s = inst.nextLine();
        String t = inst.nextLine();
        isomorphic_Strings is = new isomorphic_Strings();
        if(is.isISomorphic(s, t)==true) System.out.println("YES");
        else System.out.println("NO");
    }
}
