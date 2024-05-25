class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict=new HashSet<>(wordDict);
        return find(s,0,dict);
    }
    public List<String> find(String s,int start,HashSet<String> dict){
        List<String> ans=new ArrayList<>();
        if(start==s.length()){
            ans.add("");
            return ans;
        }
        for(int end=start;end<=s.length();end++){
            String prefix=s.substring(start,end);
            if(dict.contains(prefix)){
                List<String> temp=find(s,end,dict);
                for(String suffix:temp){
                    if(suffix.equals("")){
                        ans.add(prefix+""+suffix);
                    }
                    else{
                        ans.add(prefix+" "+suffix);
                    }
                }
            }
        }
        return ans;
    }
}