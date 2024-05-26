class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int mod=(int)Math.pow(10,9)+7;
        int n=deliciousness.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<22;j++){
                int t1=1<<j;
                int t2=t1-deliciousness[i];
                if(h1.containsKey(t2)){
                    ans=(ans+h1.get(t2))%mod;
                }
                
                
            }
            h1.put(deliciousness[i],h1.getOrDefault(deliciousness[i],0)+1);
        }
        return ans;
    }
}

// class Solution {
//     int mod = 1000000007;
//     public int countPairs(int[] arr) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int n = arr.length;
//         long res = 0;
//         for (int num : arr) {
//             int power = 1;
//             for (int i = 0; i < 22; i++) {
//                 if (map.containsKey(power - num)) {
//                     res += map.get(power - num);
//                     res %= mod;
//                 }
//                 power *= 2;
//             }
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         return (int) res;
//     }