public class Add_String {
    public static void main(String[] args) {
        String num1 = "3876620623801494171", num2 = "6529364523802684779";
        System.out.println(addStrings(num1, num2));
    }
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int carry = 0, base=10;
        StringBuilder ans = new StringBuilder();
        while(n1>=0 || n2>=0){
            int s=0, s1=0, s2=0;
            if(n1>=0){
                s1 = num1.charAt(n1--)-'0';
            }
            if(n2>=0){
                s2 = num2.charAt(n2--)-'0';
            }
            s = s1+s2+carry;
            if(s>=base){
                carry=1;
                s -= base;
            }else{
                carry=0;
            }
            ans.append(s);
        }
        if (carry==1){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}
