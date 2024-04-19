class Solution {
    public int lengthOfLastWord(String s) {
        //ArrayList<String> a1=new ArrayList<>();
        String s1="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1=s1+s.charAt(i);
            }
            else{
                //a1.add(s1);
                s1="";
            }
        }
        return s1.length();
        
    }
}