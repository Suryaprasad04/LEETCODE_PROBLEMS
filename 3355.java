class Solution {//time exceeded for just 2 cases
    public boolean isZeroArray(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int min=queries[i][0];
            int max=queries[i][1];
                
            
            for(int j=min;j<=max;j++){
                if(nums[j]>0){
                        nums[j]=nums[j]-1;
                }
            }
            
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return false;
            }
        }
        return true;
    }
}
