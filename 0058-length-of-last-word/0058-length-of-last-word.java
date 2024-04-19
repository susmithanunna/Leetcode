class Solution {
    public int lengthOfLastWord(String s) {
        //ArrayList<String> a1=new ArrayList<>();
        String s1="";
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                s1=s1+s.charAt(i);
            }
            else{
               break;
            }
        }
        return s1.length();
        
    }
}