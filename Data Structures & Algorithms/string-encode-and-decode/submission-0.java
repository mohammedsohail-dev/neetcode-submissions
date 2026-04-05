class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            ans.append(strs.get(i).length());
            ans.append('#');
            ans.append(strs.get(i));
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int count = Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j+1,j+1+count));
            i=j+1+count;
        }
        return ans;
    }
}
