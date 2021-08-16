public class LongestPalindromeSubstring{
    public String longestPalindrome(String s) {
        String palindrome="";
        int size=s.length();
        boolean isPalindrome=false;
        while(size>0){
            int subStringLength=s.length()-size+1;
            //System.out.println(subStringLength);
            for(int i=0;i<subStringLength;i++){
                String sub = s.substring(i,i+size);
                //System.out.println(sub);
                if(isPalindrome(sub)==true){
                    isPalindrome=true;
                    palindrome=sub;
                    break;
                }
            }
            if(isPalindrome==true){
                break;
            }
            size--;
        }
        return palindrome;
    }
    public boolean isPalindrome(String s){
        if(s.length()==1){
            return  true;
        }
        else{
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            String rev=sb.toString();
            if(s.equals(rev)){
                return true;
            }
            else{
                return false;
            }


        }
    }
}
