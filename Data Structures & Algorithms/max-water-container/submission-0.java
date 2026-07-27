class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right=heights.length-1;

        while(left<right){
            int area = (right-left)* Math.min(heights[left], heights[right]);
            maxArea = Math.max(area, maxArea);
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }
        }

        return maxArea;
    }
}

/**
 * 2 pointer approach
 * 
 * max=0;
 * calc area between left and right pointer
 *  - area = (right-left)* min(height[right],height[left])
 *  - if area>max, max = area
 *  - if height[left+1]>height[left], left++
 *  - if height[right-1]>height[right], right--
 */