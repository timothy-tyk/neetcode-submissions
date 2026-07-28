class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount=0;
        int highestfreq=0;
    
        Map<Character, Integer> freqMap = new HashMap<>();

        char[] chars = s.toCharArray();
        int left =0;
        int right=0;

        while(right<chars.length){
            freqMap.put(chars[right], freqMap.getOrDefault(chars[right], 0) + 1);
            highestfreq = Math.max(highestfreq, freqMap.get(chars[right]));

            if(right-left+1-highestfreq<=k){
                right++;
            }else{
                char leftChar = chars[left];
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                left++;
                right++;
            }
            maxCount=Math.max(maxCount, right-left);

            }
        return maxCount;
    }
}