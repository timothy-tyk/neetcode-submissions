class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> temperatureStack = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!temperatureStack.isEmpty() && temperatures[i]>temperatures[temperatureStack.peek()]){
                int previousIndex = temperatureStack.pop();
                result[previousIndex] = i-previousIndex;
            }
            temperatureStack.push(i);
        }

        return result;
    }
}

/**
 * Monotonic stack
 * for temp in temps
 *  - add temp's index to stack
 *  - check if current temp > temp at top of stack (do it in while loop recursively)
 *      - if yes, pop the index and write the difference in index (i - previous) to result[previous index]
 *      - else, push index to stack
 * 
 */