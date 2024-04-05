class Solution {
    public int mySqrt(int x) {
//         // if(x==0){
//         //     return 0;
//         // }
//         long l=1;
//         long r=x;
        
//         while(l<=r){
//           int mid=(int)(l+r)/2;
//             int sq=(int)(mid*mid);
//             if(sq==x){
//                 return mid;
//             }
//             else if(sq<x){
//                 l=(long)mid+1;
//             }
//             else{
//                 r=(long)mid-1;
//             }
        
//     }
//         return (int)r;
        return (int)Math.sqrt(x);
}
}