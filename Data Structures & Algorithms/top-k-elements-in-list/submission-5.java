class Solution {
        public int[] topKFrequent(int[] nums, int k) {
        // Create Frequency Map (key=num, val=count)
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num:nums){
            int count = freqMap.getOrDefault(num,0);
            freqMap.put(num,count+1);
        }
        // Create the buckets, at most there will be nums.length count, so the total no. of buckets = nums.length;
        // In each bucket there will be a List<Integer>, incase 2 keys have the same count;
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }
        // Add keys into the buckets where bucket index = key's count;
        for(int key: freqMap.keySet()){
            buckets[freqMap.get(key)].add(key);
        }
        // Iterate bucket backwards for largest counts;
        // When idx==k, stop and return the result;
        int[] result = new int[k];
        int idx = 0;
        for(int i=buckets.length-1;i>=0;i--){
            for(int listNum: buckets[i]){
                result[idx++] = listNum;
                if(idx>=k){
                    return result;
                }
            }
        }
        return result;
    }
}
