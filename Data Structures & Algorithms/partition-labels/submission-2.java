class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer>  map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), i);
        }

        int end = 0; 
        int size = 0;
        List<Integer> ans = new ArrayList<>();
        for(int j = 0;j<s.length();j++){
            size++;
            end = Math.max(end, map.get(s.charAt(j)));

            if(j == end){
                ans.add(size);
                size = 0;
            }

        }

        return ans;
        
    }
}
