class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map1.get(s.charAt(i))==null){
                map1.put(s.charAt(i), 1);
            } else {
                map1.put(s.charAt(i), map1.get(s.charAt(i)+1));
            }
            
        }

        for(int j=0;j<t.length();j++){
            if(map2.get(t.charAt(j))==null){
                map2.put(t.charAt(j), 1);
            } else {
                map2.put(t.charAt(j), map2.get(t.charAt(j)+1));
            }
        }

        return map1.equals(map2);
        
    }
}
