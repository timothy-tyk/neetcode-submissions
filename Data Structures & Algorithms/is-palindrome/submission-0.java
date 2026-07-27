class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = str.toCharArray();
        
        int left = 0;
        int right = chars.length-1;

        while(left<right){
            if(chars[left]!=chars[right]) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
/*
* 2 pointer 
- remove whitespace
- iterate through the string with 2 pointers
- if left!=right, return false
- else return true;
*/