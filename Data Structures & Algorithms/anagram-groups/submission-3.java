class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] word = new char[str.length()];
            for(int i=0;i<str.length();i++){
                word[i] = str.charAt(i);
            }
            Arrays.sort(word);
            String key = new String(word);
            
            if(map.get(key) == null){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                map.get(key).add(str);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}
