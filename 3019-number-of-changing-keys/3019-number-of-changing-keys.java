class Solution {
    public int countKeyChanges(String s) {
        String s1=s.toLowerCase();
        int c=0;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s1.charAt(i)!=s1.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}