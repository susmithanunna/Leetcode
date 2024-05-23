class Solution {
    public boolean canConstruct(String s, int k) {
         if(s.length()<k){
            return false;
        }
        HashMap<Character,Integer> h1=new HashMap<>();
        Integer c;
        int a1=0;
        for(int i=0;i<s.length();i++){
            c=h1.get(s.charAt(i));
            if(c==null){
                c=0;
            }
            h1.put(s.charAt(i),c+1);
        }
        for(char c1:h1.keySet()){
            if(h1.get(c1)%2==1){
                a1++;
            }
        }
        if(a1>k){
            return false;
        }
        return true;
    }
}