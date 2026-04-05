class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 =  new HashMap<>();

        for(int i=0;i<s.length();i++){
            map1.putIfAbsent(s.charAt(i), 0);
            map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
        }

        for(int i=0;i<t.length();i++){
            map2.putIfAbsent(t.charAt(i), 0);
            map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
        }

        if(map1.equals(map2)){
            return true;
        }

        return false;
    }
}
