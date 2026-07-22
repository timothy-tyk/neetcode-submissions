class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> numCount = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numCount.containsKey(nums[i])){
                Integer newCount = numCount.get(nums[i])+1;
                numCount.put(nums[i], newCount);
            }else{
                numCount.put(nums[i],1);
            }
        }
        List<Integer> kCounts = numCount.values().stream().sorted(Comparator.reverseOrder()).toList().subList(0, k);
        for (int i:kCounts){
            System.out.println(i);
        }
        List<Integer> keys = numCount.keySet().stream().toList();
        for(int count: kCounts){
            for(int key:keys){
                if(numCount.get(key)==count && !res.contains(key)){
                    res.add(key);
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}