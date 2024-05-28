class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max=0;
        int l=0;
        int curr=0;
        for(int r=0;r<s.length();r++){
            curr=curr+(int)Math.abs(s.charAt(r)-t.charAt(r));
            while(curr>maxCost){
                curr=curr-(int)Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            max=(int)Math.max(max,r-l+1);
        }
        return max;
    }
}