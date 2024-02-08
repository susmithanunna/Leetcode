class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(x,y)->y[1]-x[1]);
        int i=0;
        int sum=0;
        while(i<boxTypes.length){
            int q=boxTypes[i][0];
            int q1=(int)Math.min(truckSize,q);
            sum=sum+(q1*boxTypes[i][1]);
            i++;
            truckSize-=q1;
            if(truckSize==0){
                break;
            }
        }
        return sum;
    }
}