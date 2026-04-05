class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_msg = new StringBuilder();
        if(strs.size() == 0){
            return "";
        }
        for(int i=0;i<strs.size();i++){
            String element = strs.get(i);
            int size = element.length();
            encoded_msg.append(size);
            encoded_msg.append("#");
            encoded_msg.append(element);
        }

        return encoded_msg.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str==""){
            return ans; 
        }
        
        int i = 0;
        while(i<str.length()){
            int start = i;
            while(str.charAt(start)!='#'){
                start++;
            }
            int size = Integer.parseInt(str.substring(i,start));
            start++;
            int end = start+size;
            String element = str.substring(start,end);
            ans.add(element);
            i = end;
        }

        return ans;
    }


}
