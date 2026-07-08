class Twitter {
    private HashMap<Integer, HashSet<Integer>> followerMap;
    private HashMap<Integer, List<int[]>> feedMap;
    private int time;

    public Twitter() {
        followerMap = new HashMap<>();
        feedMap = new HashMap<>();
        time = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        List<int[]> list = feedMap.getOrDefault(userId, new ArrayList<>());

        list.add(new int[] {time, tweetId});
        time++;

        feedMap.put(userId, list);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<int[]> allTweets = new ArrayList<>();

        // get user's own tweets
        if (feedMap.containsKey(userId)) {
            allTweets.addAll(feedMap.get(userId));
        }

        // get tweets from people user follows
        HashSet<Integer> followerIdList = followerMap.getOrDefault(userId, new HashSet<>());

        for (int followeeId : followerIdList) {
            if (feedMap.containsKey(followeeId)) {
                allTweets.addAll(feedMap.get(followeeId));
            }
        }

        // sort by most recent time
        allTweets.sort((a, b) -> b[0] - a[0]);

        // return up to 10 tweetIds
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < allTweets.size() && i < 10; i++) {
            res.add(allTweets.get(i)[1]);
        }

        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId)
            return;

        HashSet<Integer> followerIdList = followerMap.getOrDefault(followerId, new HashSet<>());
        followerIdList.add(followeeId);
        followerMap.put(followerId, followerIdList);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (!followerMap.containsKey(followerId))
            return;

        HashSet<Integer> followerIdList = followerMap.get(followerId);
        followerIdList.remove(followeeId);
    }
}