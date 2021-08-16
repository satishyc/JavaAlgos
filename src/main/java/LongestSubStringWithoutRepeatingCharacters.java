import java.util.HashMap;
/*Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
* */
public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int sizeOfString=s.length();
        for(int i=0;i<sizeOfString;i++){
            map.put(s.charAt(i),i);
        }
        int noOfUniqueChar=map.size();
        boolean isExist=false;
        while(noOfUniqueChar>0){
            int possibleSubStringLength=sizeOfString-noOfUniqueChar+1;
            for(int j=0;j<possibleSubStringLength;j++){
                String sub=s.substring(j,j+noOfUniqueChar);
                if(checkUnique(sub,noOfUniqueChar)==true){
                    isExist=true;
                    break;
                }

            }
            if(isExist==true){
                break;
            }

            noOfUniqueChar--;
        }
        return noOfUniqueChar;

    }
    public boolean checkUnique(String s, int size){
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(s.charAt(i),i);
        }
        if(map.size()==size){
            return true;
        }
        else{
            return false;
        }
    }
}
