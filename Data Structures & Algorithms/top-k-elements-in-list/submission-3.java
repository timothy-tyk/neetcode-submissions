class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> numCount = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numCount.containsKey(nums[i])){
                Integer newCount = numCount.get(nums[i])+1;
                numCount.put(nums[i], newCount);
            }else{
                numCount.put(nums[i],1);
            }
        }

        PriorityQueue<Integer> countQueue = new PriorityQueue<>((a,b)->numCount.get(a)-numCount.get(b));
        for(int i: numCount.keySet()){
            countQueue.add(i);
            if(countQueue.size()>k) countQueue.poll();
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = countQueue.poll();
        }
        return result;

    }
}

/*
PRIORITYQUEUE automat
*/
