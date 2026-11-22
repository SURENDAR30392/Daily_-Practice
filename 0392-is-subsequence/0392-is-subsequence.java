class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        int i=0,j=0;
        while(j<t.length()&& i<s.length()){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}