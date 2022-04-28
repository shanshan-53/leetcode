class CustomStack {

    int[] stack;
    int index;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        index = -1;
    }
    
    public void push(int x) {
        if(index+1 < stack.length){
            index++;
            stack[index] = x;
        }
    }
    
    public int pop() {
        if(index >= 0){
            int popVal = stack[index];
            stack[index] = 0;
            index--;
            return popVal;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < stack.length; i++){
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
