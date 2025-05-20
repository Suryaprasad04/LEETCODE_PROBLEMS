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


class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            diff[l]++;
            if (r + 1 < n) {
                diff[r + 1]--;
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += diff[i];
            if (nums[i] > cnt) {
                return false;
            }
        }

        return true;
    }
}
