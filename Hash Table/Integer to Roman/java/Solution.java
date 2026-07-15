class Solution {
    public String intToRoman(int num) {
       int n[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String str[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       int i=0;
       StringBuilder sb=new StringBuilder();
       while(num>0) {
        if(num>=n[i]){
            sb.append(str[i]);
            num-=n[i];
        }
        else{
            i++;
        }
       }
       return sb.toString();
    }
}