import java.util.HashMap;
//given a string, find the length of longest panlindorme that can be formed from it
//soln:
/*
 * This code first creates a HashMap to store the frequency of each character in the string.
 *  Then it iterates over the values in the HashMap, adding the frequency of each character that has an even frequency to a variable maxLength.
 *  If there is at least one character with an odd frequency, it adds 1 to maxLength to account for the center of the palindrome. 
 * Finally, it returns maxLength, which is the longest palindrome length that can be formed from the input string. 
 * The time complexity of this approach is O(n) where n is the length of the input string. iterates through the input string once to populate the hashmap with the frequency of each character, and then iterates through the values in the hashmap once to calculate the longest palindrome length.
 * The space complexity of this approach is O(n) as well, where n is the number of distinct characters in the input string. This is because it creates a hashmap to store the frequency of each character in the input string,The worst case scenario where all the characters are different, the space complexity will be O(n) and the best case scenario where all the characters are the same, the space complexity will be O(1).
   
 */
public class longestpalindrome{
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int maxLength = 0;
        boolean odd = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                maxLength += value;
            } else {
                maxLength += value - 1;
                odd = true;
            }
        }
        return odd ? maxLength + 1 : maxLength;
    }
    public static void main(String[] args) {
        longestpalindrome lp = new longestpalindrome();
        int ans = lp.longestPalindrome("abcccdaaaeeee");
        System.out.println(ans);
    }
}