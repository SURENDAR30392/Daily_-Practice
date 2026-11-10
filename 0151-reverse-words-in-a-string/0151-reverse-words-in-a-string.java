class Solution {
    public String reverseWords(String s) {
        String b="";
        String arr[]=s.trim().split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            if(i!=0){
            b+=arr[i]+" ";
            }
            else{
                b+=arr[i];
            }
        }
        return b;
    }
}