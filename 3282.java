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


class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long totalScore = 0;
        int maxSoFar = 0;

        // Iterate through the array up to the second-to-last element
        for (int i = 0; i < nums.size() - 1; i++) {
            // Update maxSoFar if current element is greater
            maxSoFar = Math.max(maxSoFar, nums.get(i));
            // Add maxSoFar to the total score
            totalScore += maxSoFar;
        }

        return totalScore;
    }
}
