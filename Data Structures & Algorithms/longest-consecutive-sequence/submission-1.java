class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Set<Integer> numSet = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }
        Integer max=0;
        
        for(Integer k: numSet){
            Integer count = 1;
            if(numSet.contains(k-1)){
                while(numSet.contains(k+1)){
                    k=k+1;
                    count++;
                }
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println(numSet);

        return max+1;
    }
}
