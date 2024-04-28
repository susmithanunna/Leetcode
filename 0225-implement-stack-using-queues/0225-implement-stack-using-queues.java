class MyStack {
     Queue<Integer> q1;
     int top;
    public MyStack() {
    q1=new LinkedList<>();;
       top=-1;
        
    }
    
    public void push(int x) {
        q1.add(x);
        top++;
        for(int i=0;i<q1.size()-1;i++){
            q1.add(q1.peek());
            q1.remove();
        }
    }
    
    public int pop() {
        top--;
       return q1.remove(); 
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(top==-1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */