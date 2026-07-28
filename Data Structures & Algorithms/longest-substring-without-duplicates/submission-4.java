class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int result = 0;
        int longestCount = 0;

        if(s.length()>0){
            result = 1;
        }
        
        for(int i=0;i<chars.length;i++){
            if(!charIndexMap.containsKey(chars[i])){
                charIndexMap.put(chars[i], i);
                longestCount++;
            }else{
                int prevIndex = charIndexMap.get(chars[i]);
                charIndexMap.put(chars[i], i);
                i=prevIndex;
                charIndexMap.clear();
            
                longestCount=0;
            }
            result = Math.max(longestCount, result);
        }
        return result;
    }
}

/**
 * init HashMap for character and index position
 * 
 * for char in string s
 * check if char exists in HashMap
 *  - if false, tempLength++, add char to set
 *  - if true, result = max(result, tempLength)
 *      Slide the window to the index+1 position of the duplicated char
 *      update the index position of the char duplicate in the hashmap
 *      tempLength - no. of chars skipped forward (dup char index+1 - current index)?
 */
