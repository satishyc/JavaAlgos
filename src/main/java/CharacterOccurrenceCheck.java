import java.util.HashMap;
import java.util.Map;
/*
* Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).



Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
* */
public class CharacterOccurrenceCheck {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int k = map.get(s.charAt(i));
                map.put(s.charAt(i), k + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

        }
        int count = map.get(s.charAt(0));
        boolean ans=true;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if(count==e.getValue()){
                continue;
            }
            else{
                ans=false;
                break;
            }
        }
        return ans;
    }
}
