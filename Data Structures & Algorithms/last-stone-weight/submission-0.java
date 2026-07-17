class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b, a)
        );
        for (int stone : stones)   
            pq.add(stone);
        while (pq.size() >= 2) {
            int first = pq.remove();
            int second = pq.remove();
            if (first == second)
                continue;
            pq.add(first - second);
        }
        return pq.size() == 0 ? 0 : pq.remove();
    }
}
