class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char c=allowed.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=words.length;
        for(String word:words){
            boolean ans=true;
            for(int i=0;i<word.length();i++){
                if(!map.containsKey(word.charAt(i))){
                    ans=false;
                }
            }
            if(!ans){
                count--;
            }
        }
        return count;
    }
}
