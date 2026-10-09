class Solution {
    public char repeatedCharacter(String s) {
       HashMap<Character,Integer> hset=new HashMap<>();
       for(char x:s.toCharArray()){
        hset.put(x,hset.getOrDefault(x,0)+1);
        if(hset.get(x)==2) return x;
       }
       return ' ';
    }
    
}