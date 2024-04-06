class Solution {
    public int maximum69Number (int num) {
        String s1=String.valueOf(num);
        String s="";
        int flag=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='6' && flag==0){
                s=s+'9';
                flag=1;
            }
            else{
                s=s+s1.charAt(i);
            }
        }
        return Integer.parseInt(s);
    }
}