class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                s1.push(s.charAt(i));
                f=1;
            }
            else{
                if(s1.size()!=0 && s.charAt(i)==')' && s1.peek()=='('){
                    s1.pop();
                }
                else if(s1.size()!=0 &&  s.charAt(i)=='}' && s1.peek()=='{'){
                    s1.pop();
                }
                else if( s1.size()!=0 && s.charAt(i)==']' && s1.peek()=='['){
                    s1.pop();
                }
                else{
                    s1.add(s.charAt(i));
                }
            }
        }
        
        return s1.size()==0 && f==1 ?true:false;
    }
}