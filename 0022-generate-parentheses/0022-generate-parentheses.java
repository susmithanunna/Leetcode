class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<String> s1=new Stack<>();
        List<String> ans=new ArrayList<>();
        backTrack(0,0,n,s1,ans);
        return ans;
    }
    public void backTrack(int open,int closed,int n,Stack<String> s1,List<String> ans){
        if(open==closed && closed==n){
            String s="";
            Iterator it=s1.iterator();
            while(it.hasNext()){
                s=s+it.next();
            }
            ans.add(s);
            s="";
        }
        if(open<n){
            s1.add("(");
            backTrack(open+1,closed,n,s1,ans);
            s1.pop();
        }
        if(closed<open){
            s1.add(")");
            backTrack(open,closed+1,n,s1,ans);
            s1.pop();
        }
    }
}