class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums){
            if(numSet.contains(i)){
                return true;
            }
            else{
                numSet.add(i);
            }
        }
        return false;
    }
}

// Hashset and count
