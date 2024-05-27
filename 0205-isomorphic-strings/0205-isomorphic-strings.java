class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(h2.containsKey(t1)){
                if(h2.get(t1)!=s1){
                    return false;
                }
            }
            else{
                if(h1.get(s1)!=null && h1.get(s1)!=t1){
                    return false;
                }
            }
            h1.put(s1,t1);
            h2.put(t1,s1);
        }
        return true;
    }
}