import java.io.*;
import java.util.Arrays;
/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999
 */
public class IntegerToRoman {


    public String intToRoman(int num) {
        String ans="";
        while(num>0){
            if(num>=1000){
                int rem=num/1000;
                char oneThousand='M';
                num=num%1000;
                char[] chars = new char[rem];
                Arrays.fill(chars, oneThousand);
                ans+=String.valueOf(chars);

            }
            else if(num>=900){
                num=num%900;
                ans+="CM";
            }
            else if(num>=500){
                num=num%500;
                ans+="D";
            }
            else if(num>=400){
                num=num%400;
                ans+="CD";
            }
            else if(num>=100) {
                int rem=num/100;
                char oneHundred='C';
                num=num%100;
                char[] chars = new char[rem];
                Arrays.fill(chars, oneHundred);
                ans+=String.valueOf(chars);
            }
            else if(num>=90){
                num=num%90;
                ans+="XC";
            }
            else if(num>=50){
                num=num%50;
                ans+="L";
            }
            else if(num>=40){
                num=num%40;
                ans+="XL";
            }
            else if(num>=10){
                int rem=num/10;
                char ten='X';
                num=num%10;
                char[] chars = new char[rem];
                Arrays.fill(chars, ten);
                ans+=String.valueOf(chars);
            }
            else if(num>=9){
                num=num%9;
                ans+="IX";
            }
            else if(num>=5){
                num=num%5;
                ans+="V";
            }
            else if (num>=4){
                num=num%4;
                ans+="IV";
            }
            else{

                char one='I';
                char[] chars = new char[num];
                Arrays.fill(chars,one);
                ans+=String.valueOf(chars);
                num=num-num;
            }
        }
        return ans;
    }

}
