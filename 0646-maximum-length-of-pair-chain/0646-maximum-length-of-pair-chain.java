class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int n=pairs.length;
        int i=1;
        int last=0;
        int c=1;
        while(i<n){
            if(pairs[i][0]>pairs[last][1]){
                c++;
                last=i;
            }
            i++;
        }
        return c;
    }
}