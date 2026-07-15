class MinStack {
    private Deque<Pair<Integer, Integer>> stack;
    private int min = Integer.MAX_VALUE;

    public MinStack() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        Pair<Integer, Integer> pair = new Pair(val, min);
        stack.push(pair);
    }
    
    public void pop() {
        if (stack.isEmpty())
            return;
        Pair<Integer, Integer> pair = stack.pop();
        if (!stack.isEmpty())
            min = stack.peek().getValue();
        else min = Integer.MAX_VALUE;
    }
    
    public int top() {
        if (stack.isEmpty())
            return -1;
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return min;
    }
}
