class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] key = new char[strs[i].length()];
            for(int j=0;j<strs[i].length();j++){
                key[j] = strs[i].charAt(j);
            }
            Arrays.sort(key);
            String strkey = new String(key);

            if(map.get(strkey)==null){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(strkey, list);
            } else {
                map.get(strkey).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());

    }
}
