class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        if(num1.length() < num2.length()){
            return multiply(num2,num1);
        }

        String res = "";
        int zero = 0;
        for(int i = num2.length()-1;i>=0;i--){
            String cur = mult(num1.toCharArray(), num2.charAt(i), zero);
            res = add(res, cur);
            zero++;
        }

        return res;
    }
    public String mult(char[] num, char mul, int zeros){
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        for(int i = num.length-1;i>=0;i--){
            int a = carry + (num[i] - '0')*(mul-'0');
            carry = a/10;
            list.add(a%10);
            if(i == 0 && carry!=0){
                list.add(carry);
            }
        }

        char[] ans = new char[list.size()];
        for(int j = 0;j<list.size();j++){
            ans[j] = (char) (list.get(list.size()-1-j) + '0');
        }
        
        String res = new String(ans);
        for(int k = 0;k<zeros;k++){
            res = res+"0";
        }

        return res;
    }

    public String add(String n1, String n2){
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = n1.length() - 1;
        int j = n2.length() - 1;
        while(i>=0 || j>=0 || carry>0){
            int a = 0;
            if(i>=0){
                a = n1.charAt(i) - '0';
            }

            int b = 0;
            if(j>=0){
                b = n2.charAt(j) - '0';
            }

            int total = a + b + carry;

            res.append(total % 10);
            carry = total / 10;
            i--;
            j--;

        }

        return res.reverse().toString();
    }
}
