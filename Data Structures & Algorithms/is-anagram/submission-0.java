class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c:s.toCharArray()){
            Integer count = 1;
            if(charMap.containsKey(c)) {
                count = charMap.get(c)+1;
            }
            charMap.put(c, count);
        }
        for(char c:t.toCharArray()){
            if(!charMap.containsKey(c)) return false;
            else{
                Integer val = charMap.get(c);
                if(val>0){
                charMap.put(c, val-1);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

/**
 * for first string, add each char to hashamp
 * for 2nd string, remove each char of string, from the hashmap
 *  if char cant be removed, return false
 * finally, check hashmap that no chars left, return true
 */