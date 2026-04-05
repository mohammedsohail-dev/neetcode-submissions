class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.length() == 0){
            return new ArrayList<>();
        }

        StringBuilder build = new StringBuilder();
        List<String> ans = new ArrayList<>();
        backtrack(map, digits,0,ans, build);
        return ans;
    }
    public void backtrack( HashMap<Character, String> map,String digits, int start, List<String> ans, StringBuilder build){
        if(start == digits.length()){
            ans.add(build.toString());
            return;
        }
        String letter = map.get(digits.charAt(start));
        for(int i = 0;i<letter.length();i++){
            build.append(letter.charAt(i));
            backtrack(map,digits,start+1,ans,build);
            build.deleteCharAt(build.length()-1);
        }
    }
}
