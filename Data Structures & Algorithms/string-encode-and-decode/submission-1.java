class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            string.append(strs.get(i).length());
            string.append('#');
            string.append(strs.get(i));
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            String part = str.substring(j+1,j+1+length);
            ans.add(part);
            i = j+1+length;
        }

        return ans;
    }
}
