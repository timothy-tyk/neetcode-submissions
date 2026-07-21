 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramStrings = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            
            if(anagramStrings.containsKey(sortedString)){
                anagramStrings.get(sortedString).add(s);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                anagramStrings.put(sortedString, newList);
            }
        }

        return anagramStrings.values().stream().toList();
    }
}