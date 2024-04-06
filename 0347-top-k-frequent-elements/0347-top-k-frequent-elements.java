class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        Integer c;
        for(int i=0;i<nums.length;i++){
            c=h1.get(nums[i]);
            if(c==null){
                c=0;
            }
            h1.put(nums[i],c+1);
        }
        ArrayList<ArrayList<Integer>> a1=new ArrayList<>();
        for(Integer i:h1.keySet()){
            ArrayList<Integer> a=new ArrayList<>();
            a.add(h1.get(i));
            a.add(i);
            a1.add(a);
        }
        Collections.sort(a1,new Comp());
        int ans[]=new int[k];
        int c1=0;
        for(ArrayList<Integer> i:a1){
            if(k==0){
                break;
            }
            ans[c1]=i.get(1);
            c1++;
            k--;
        }
        return ans;
    }
}
class Comp implements Comparator<ArrayList<Integer>>{
    @Override
    public int compare(ArrayList<Integer> a1,ArrayList<Integer> a2){
        for(int i=0;i<2;i++){
            int ans=Integer.compare(a2.get(i),a1.get(i));
            if(ans!=0){
                return ans;
            }
        }
        return Integer.compare(a2.get(2),a1.get(2));
       
    }
}