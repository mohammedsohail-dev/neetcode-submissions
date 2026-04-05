class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), i);
        }

        int farthest = 0;
        int count = 0;
        for(int j = 0; j<s.length();j++){
            count++;
            farthest = Math.max(farthest, map.get(s.charAt(j)));

            if(j == farthest){
                ans.add(count);
                count = 0;
            }
        }

        return ans;


    }
}
