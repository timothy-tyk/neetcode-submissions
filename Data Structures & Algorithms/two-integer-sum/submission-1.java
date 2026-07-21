class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = nums.length-1;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>0;j--){
                if(nums[i]+nums[j]==target && i!=j){
                    a = i;
                    b = j;
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{a,b};
    }
}

/**
 * 2 pointer solution
 */