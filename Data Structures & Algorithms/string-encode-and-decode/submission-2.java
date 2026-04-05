class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            ans.append(strs.get(i).length());
            ans.append("#");
            ans.append(strs.get(i));
        }

        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = i;
            
            if(str.charAt(i) != '#' ){
                j++;
            }

            int size = Integer.parseInt(str.substring(i,j));
            j++;

            String element = str.substring(j,j+size);
            ans.add(element);

            i = j+size;
        }

        return ans;
    }
}
