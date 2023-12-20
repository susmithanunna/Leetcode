class Solution {
    public String reverseWords(String s) {
        // String s1="";
        // String s2="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=' '){
        //         s1=s1+s.charAt(i);    
        //     }
        //     if(s.charAt(i)==' ' || i==s.length()-1){
        //         s1=s1.trim();
        //         s2=s1+s2;
        //         s2=" "+s2;
        //         s1="";
        //     }
        // }
        // s2=s2.trim();
        // return s2;
//         Stack<String> s1=new Stack<>();
//         String temp="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!=' '){
//                 temp=temp+s.charAt(i);
//             }
//             if(s.charAt(i)==' ' || i==s.length()-1){
// 				s1.push(temp);
// 				temp="";
// 			}
//         }
//         temp="";
//         while(s1.isEmpty()){
//             temp=temp+s1.pop();
//             temp=temp.trim();
//             temp=temp+" ";
            
//         }
//         return temp;
		Stack<String> s1=new Stack<>();
		String temp="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ' ){
				temp=temp+s.charAt(i);
			}
			if(s.charAt(i)==' ' || i==s.length()-1){
				s1.push(temp);
				temp="";
			}
		}
		temp="";
		while(!s1.isEmpty()){
			temp=temp+s1.pop();
            temp=temp.trim();
			temp=temp+" ";
		}
		temp=temp.trim();
		return temp;
    }
}