class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> hashmap = new HashMap<>();

        for (String word : strs){
            String hash = this.encode(word);
            ArrayList<String> words = hashmap.getOrDefault(hash, new ArrayList<>());
            words.add(word);
            hashmap.put(hash, words);
            // hashmap.computeIfAbsent(hash, k -> new ArrayList<>()).add(word);
        }
        List<List<String>> results = new ArrayList<>();
        for (List<String> val : hashmap.values()){
            results.add(val);
        }
        return results;
        
    }

    public String encode(String word){
        int[] hash = new int[26];

        for (int i = 0; i < word.length(); i++){
            hash[word.charAt(i) - 'a'] += 1;
        }

        return Arrays.toString(hash);
    }
}
