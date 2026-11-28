class MyStack {

     Queue <Integer> list;
    int currSize ;
    public MyStack() {
        list = new LinkedList<>();
        currSize=0;
    }

    public void push(int x) {

    int oldSize = list.size();
    list.add(x);
    currSize++;
       for(int i=0;i<oldSize;i++)
        {
            list.add(list.peek());
            list.remove();
        }
    }

    public int pop() {
        int val=list.peek();
        list.remove();
       currSize--;
      return val;
    }

    public int top() {
      return list.peek(); 
    }

    public boolean empty() {
        return currSize == 0;
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