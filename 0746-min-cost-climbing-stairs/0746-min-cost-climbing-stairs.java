class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int cost1[]=new int[cost.length+1];
         int n=cost1.length;
        for(int i=0;i<n-1;i++){
            cost1[i]=cost[i];
        }
       //System.out.println(cost1[n-1]+" "+n+" "+cost1[n-3]);
        for(int i=n-3;i>=0;i--){
            cost1[i]=(int)Math.min(cost1[i]+cost1[i+1],cost1[i]+cost1[i+2]);
        }
        return (int)Math.min(cost1[0],cost1[1]);
    }
}