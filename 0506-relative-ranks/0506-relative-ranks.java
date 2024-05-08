class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score){
            pq.offer(i);
        }
        HashMap<Integer,String> h1=new HashMap<>();
        int c=1;
        while(!pq.isEmpty()){
            if(c==1){
                h1.put(pq.remove(),"Gold Medal");
            }
            else if(c==2){
                h1.put(pq.remove(),"Silver Medal");
            }
            else if(c==3){
                h1.put(pq.remove(),"Bronze Medal");
            }
            else{
                h1.put(pq.remove(),Integer.toString(c));
            }
            c++;
        }
        String ans[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            ans[i]=h1.get(score[i]);
        }
        return ans;
    }
}



 