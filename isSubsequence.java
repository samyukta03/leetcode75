/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
of the characters without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true, since a b c are in a sequence in string t hence they form a sub'sequence'
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false, because x is not even there in string t hence they wont form a sub'sequence'
Example 3:
Input: s = "acb", t = "ahbgdc"
Output: false, because c is there but b comes before c in string t hence they wont form a sub'sequence'
 */
import java.util.Arrays;

public class isSubsequence {
        public boolean issubsequence1(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
          return i==s.length();
        }
        public boolean issubsequence2(String s, String t) {
            int[] indexarr = new int[s.length()];
            int startfrom = 0;
            for(int i=0;i<s.length();i++){
                indexarr[i]= t.indexOf(s.charAt(i), startfrom);
                if(indexarr[i]==-1 || i>0 && indexarr[i]<indexarr[i-1] ) return false;
                startfrom=1+indexarr[i];

            }
            return true;
        }
        public static void main(String[] args) {
            isSubsequence sol = new isSubsequence();
            System.out.println(sol.issubsequence1("acb", "ahgbfc"));
            System.out.println(sol.issubsequence2("abc", "ahgbfc"));
        }
}
