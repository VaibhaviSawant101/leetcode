class MyQueue {
    Stack<Integer> obj = new Stack<>();  
    public MyQueue() {
         
    }
    
    public void push(int x) {
        if(obj.size() == 0)
        {
            obj.push(x);
        }
        else
        {
            Stack<Integer> helper = new Stack<>();
            while(obj.size()!=0)
            {
                helper.push(obj.pop());
            }
            obj.push(x);
            while(helper.size()!=0)
            {
                obj.push(helper.pop());
            }
        }
    }
    
    public int pop() {
        int num = obj.pop();
        return num;
    }
    
    public int peek() {
        int num = obj.peek();
        return num;
    }
    
    public boolean empty() {
        if(obj.size() > 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */