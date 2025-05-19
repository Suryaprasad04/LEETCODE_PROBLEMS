class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long sum=0;
        int left=0;
        int right=1;
        while(right<nums.size()){
            if(nums.get(right)>nums.get(left)){
                sum+=((long)(right-left)*nums.get(left));
                left=right;
            }else{
                right++;
            }
            
        }
         // Add the last segment
        sum += (long)((nums.size()-1) - left) * nums.get(left);
        return sum;
    }
}
