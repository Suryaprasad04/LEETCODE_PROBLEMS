class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer>vmap=new HashMap<>();
        Map<Character,Integer>cmap=new HashMap<>();
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u')
               vmap.put(c,vmap.getOrDefault(c,0)+1);
            else
                cmap.put(c,cmap.getOrDefault(c,0)+1);
        }
        int max1=0;
        for(int values:vmap.values() ){
            if(values>max1){
                max1=values;
            }
        }
        int max2=0;
        for(int values:cmap.values() ){
            if(values>max2){
                max2=values;
            }
        }
        return max1+max2;

    }
}
