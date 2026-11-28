class MyStack {

      Queue<Integer> q;
      int size;
    public MyStack() {
        q=new LinkedList<>();  // arrayList - dequeuing the first ele needs shifting all the elements that requires O(n) operations.... and in singly LL directly delete the top node and pop needs O(1) operations 
    }
    
    public void push(int x) {
        size=q.size();

        q.add(x);

        for(int i=0;i<size;i++)
        {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        int value=q.peek();  // return the value

          q.poll(); // removes the top and returns
         size--;
        return value;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
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