class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int check=0;
        while(i>=0 || j>=0 || check!=0){
            if(i>=0){
                check=check+a.charAt(i)-'0'; 
                i--;
            }
           if(j>=0){
                check=check+b.charAt(j)-'0';
               j--;
           }
           
            ans.append(check%2);
            check=check/2;
        }
        return ans.reverse().toString();
    }
}
