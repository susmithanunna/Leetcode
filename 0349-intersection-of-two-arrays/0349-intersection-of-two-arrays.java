class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> a1=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
       // int  small=0;
       //  if(n1<n2){
       //      small=1;
       //  }
       //  else{
       //      small=2;
       //  }
       // if(small==1){
            for(int i=0;i<n2;i++){
                for(int j=0;j<n1;j++){
                    if(nums1[j]==nums2[i]){
                        a1.add(nums1[j]);
                    }
                }
            }
        int ans[]=new int[a1.size()];
        int c=0;
        for(int i:a1){
          //  System.out.println(i);
            ans[c]=i;
            c++;
        }
        return ans;
        
  }
}