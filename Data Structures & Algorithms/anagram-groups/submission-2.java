class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> ans = new HashMap<>();
       for(String str:strs){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String SortedS = new String(arr);
        ans.putIfAbsent(SortedS, new ArrayList<>());
        ans.get(SortedS).add(str);
       }
       return new ArrayList<>(ans.values()); 
    }
}
