class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        find(s,0,ans,temp);
        return ans;
    }
    public void find(String s,int index,List<List<String>> ans,List<String> temp){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();++i){
            String t1=s.substring(index,i+1);
            if(isPalindrome(t1)==true){
                temp.add(t1);
                find(s,i+1,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}