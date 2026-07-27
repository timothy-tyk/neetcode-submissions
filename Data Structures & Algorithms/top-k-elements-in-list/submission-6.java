class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i: nums){
            int freq = freqMap.getOrDefault(i, 0);
            freqMap.put(i, freq+1);
        }

        List<Integer>[] freqBucket = new List[nums.length+1];

        for(int i=0;i<freqBucket.length;i++){
            freqBucket[i] = new ArrayList<>();
        }

        for(Integer key: freqMap.keySet()){
            int freq = freqMap.get(key);
            List<Integer>keys = freqBucket[freq];
            keys.add(key);
        }

        List<Integer> flatCount = new ArrayList<>();
        for(int j=0;j<freqBucket.length;j++){
            for(int key: freqBucket[j]){
                flatCount.add(key);
            }
        }

        int[] result = new int[k];

        for(int j=0;j<k;j++){
            result[j] = flatCount.get(flatCount.size()-1-j);
        }
        

        return result;
    }
}
/**
 * reiterate bucket sorting
 * 
 * - create a map with integer:count
 * BUCKET SORT
 * - now create a List<Integer>[] with new List at each position, the [] size = nums.size+1
 * - sort the map according to the count, eg if 1 appears 5 times, 1 will be in the 5th index of the []
 * 
 * iterate backwards 
 */
