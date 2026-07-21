class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> anagramIndexes = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            
            if(anagramIndexes.containsKey(sortedString)){
                anagramIndexes.get(sortedString).add(i);
            }else{
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                anagramIndexes.put(sortedString, newList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List<Integer> indexes: anagramIndexes.values()){
            List<String> subList = new ArrayList<>();
            for(int idx:indexes){
                subList.add(strs[idx]);
            }
            result.add(subList);
        }

        return result;
    }
}

/**
 * for each string, sort it
 * add it to a Hashmap(key = sorted str, value = List<Integer> containing indexes of str)
 * 
 * at the end,
 * traverse the hashmap and create the return List<List<String>>
 */