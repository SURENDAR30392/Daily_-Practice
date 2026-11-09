class Solution {
    public String gcdOfStrings(String str1, String str2) {
           String a=str1+str2;
           String b=str2+str1;
           if(!a.equals(b)){
            return "";
           }
           int len=gcd(str1.length(),str2.length());
           return str2.substring(0,len);
    }
        public int gcd(int a,int b){
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
        return a;
        }
}