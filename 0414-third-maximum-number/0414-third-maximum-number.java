class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hset1=new HashSet<>();
        for(int x:nums){
            hset1.add(x);
        }
        ArrayList<Integer> arr1=new ArrayList<>(hset1);
        Collections.sort(arr1);
        if(arr1.size()<3){
            return arr1.get(arr1.size()-1);
        }
        else{
            return arr1.get(arr1.size()-3);
        }
    }
}