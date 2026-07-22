class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> numCount = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count = numCount.getOrDefault(nums[i], 0);
            numCount.put(nums[i], count+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        for(int key:numCount.keySet()){
            buckets[numCount.get(key)].add(key);
        }
        int[] result = new int[k];
        int index=0;
        for(int i=buckets.length-1;i>=0;i--){
            for(int num: buckets[i]){
                result[index++] = num;
                if(index==k) return result;
            }
        }
        

        return result;

    }
}
