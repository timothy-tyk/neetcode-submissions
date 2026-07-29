class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;

        for(int right=s1.length();right<=s2.length();right++){
            String subString = s2.substring(left, right);
            // System.out.println("==="+subString);
            for(char c: s1.toCharArray()){
                // System.out.println(c+" "+subString);
                if(subString.contains(String.valueOf(c))){
                    subString = subString.replaceFirst(String.valueOf(c), "");
                    if(subString.isEmpty()) return true;
                }else{
                    left++;
                    break;
                }
            }
        }
        
        return false;
    }
}

/**
 * 2 pointer solution?
 * - left pointer at index i, right pointer at index i+s1.length-1
 * - check if substring within the pointers are a permutation of s1
 * - if yes, return true
 * - if no, left++;right++;
 */
