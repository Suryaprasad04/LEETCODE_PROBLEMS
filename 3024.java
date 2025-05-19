class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0],b=nums[1],c=nums[2];
        if(a>=b+c || b>=a+c || c>=a+b){
            return "none";
        }else if(a==b && b==c){
            return "equilateral";
        }else if(a==b || b==c || a==c){
            return "isosceles";
        }
        return "scalene";
    }
}



//second approach
class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]>=(nums[0]+nums[1])){
            return "none";
        }
        int duplicate=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=duplicate){
                count++;
                duplicate=nums[i];
            }
        }
        if(count==0){
            return "equilateral";
        }
        else if(count==1){
            return "isosceles";
        }
        return "scalene";
    }
}
