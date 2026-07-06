class KthLargest {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums)
            this.add(num);
    }
    
    public int add(int val) {
        this.pq.offer(val);
        if (this.pq.size() > this.k)
            this.pq.poll();
        return this.pq.peek();
    }
}
