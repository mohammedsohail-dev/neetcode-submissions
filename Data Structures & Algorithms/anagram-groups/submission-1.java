class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String SortedS = new String(arr);
            map.putIfAbsent(SortedS, new ArrayList<>());
            map.get(SortedS).add(str); 
        }
        
        return new ArrayList<>(map.values());
    }
}
