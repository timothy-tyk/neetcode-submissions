class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount=0;
        int highestfreq=0;
    
        Map<Character, Integer> freqMap = new HashMap<>();

        char[] chars = s.toCharArray();
        int left =0;
        int right=0;

        while(right<chars.length){
            if(freqMap.containsKey(chars[right])){
                int freq = freqMap.get(chars[right]);
                freqMap.put(chars[right], freq+1);
                if(highestfreq<freq+1) highestfreq = freq+1;
            }else{
                freqMap.put(chars[right], 1);
                if(highestfreq<1) highestfreq = 1;
            }
            
            if(right-left+1-highestfreq<=k){
                right++;
            }else{
                char leftChar = chars[left];
                freqMap.put(leftChar, freqMap.get(leftChar)-1);
                left++;
                right++;
            }
            maxCount=Math.max(maxCount, right-left);
            }
        return maxCount;
    }
}
/**
 * get longest substring first?
 * 
 * init count, maxCount
 * init hashmap of characters: frequency
 * init remainingK = k;
 * 
 * - sliding window; left and right pointer at idx 0
 * - add chars to hashmap
 * 
 * - if total of lower freq chars <=k, advance right pointer
 * - else, advance left pointer, remove char from hashmap count
 *     
 */