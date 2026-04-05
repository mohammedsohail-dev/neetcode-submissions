class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.get(s.charAt(i))==null){
                map1.put(s.charAt(i), 1);
            } else {
                map1.put(s.charAt(i), 1 + map1.get(s.charAt(i)));
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map2.get(t.charAt(i))==null){
                map2.put(t.charAt(i), 1);
            } else {
                map2.put(t.charAt(i), 1 + map2.get(t.charAt(i)));
            }
        }

        return map1.equals(map2);
    }
}
