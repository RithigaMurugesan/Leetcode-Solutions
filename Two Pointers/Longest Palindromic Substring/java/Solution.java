class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
       String maxstr=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=checkpalindrome(s,i,i);
            String even=checkpalindrome(s,i,i+1);
            if(odd.length()>maxstr.length()){
                maxstr=odd;
            }
            if(even.length()>maxstr.length()){
                maxstr=even;
            }
        }
        return maxstr;
    }
    public static String checkpalindrome(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}