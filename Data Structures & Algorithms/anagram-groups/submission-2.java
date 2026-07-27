class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str : strs){
            char[] sortedChars = str.toCharArray();
            Arrays.sort(sortedChars);
            String sortedString = new String(sortedChars);
            List<String> anagrams = anagramMap.getOrDefault(sortedString, new ArrayList<>());
            anagrams.add(str);
            anagramMap.put(sortedString, anagrams);
        }
        return anagramMap.values().stream().toList();
    }
}
