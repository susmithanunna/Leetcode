class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n=wage.length;
        Workers workers[]=new Workers[n];
        for(int i=0;i<n;i++){
            workers[i]=new Workers(quality[i],wage[i]);
        }
        Arrays.sort(workers,(a,b)->Double.compare((double)a.wage/a.quality,(double)b.wage/b.quality));
                    double mincost=Double.MAX_VALUE;
                    int qualitysum=0;
                    PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
                    for(Workers worker:workers){
                         qualitysum+=worker.quality;
                        maxheap.offer(worker.quality);
                        if(maxheap.size()>k){
                            qualitysum-=maxheap.poll();
                        }
                        if(maxheap.size()==k){
                            mincost=(double)Math.min(mincost,qualitysum*((double)worker.wage/worker.quality));
                        }
                        
                    }
                    return mincost;
        
    }
}
                    class Workers{
                        int quality;
                        int wage;
                        public Workers(int quality,int wage){
                            this.quality=quality;
                            this.wage=wage;
                        }
                        
                    }
