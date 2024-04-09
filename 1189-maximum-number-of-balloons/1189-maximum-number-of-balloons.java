class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h1=new HashMap<>();
        Integer c;
        for(int i=0;i<text.length();i++){
            c=h1.get(text.charAt(i));
            if(c==null){
                c=0;
            }
            h1.put(text.charAt(i),c+1);
        }
        if(h1.get('b')==null || h1.get('a')==null || h1.get('l')==null || h1.get('o')==null || h1.get('n')==null){
            return 0;
        }
        int m1=(int)Math.min(h1.get('b'),h1.get('a'));
        int m2=(int)Math.min(h1.get('l')/2,m1);
        int m3=(int)Math.min(h1.get('o')/2,m2);
        int m4=(int)Math.min(h1.get('n'),m3);
        return m4;
    }
}