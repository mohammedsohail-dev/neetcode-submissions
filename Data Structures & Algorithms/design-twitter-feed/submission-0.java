class Twitter {
    private int time;
    private Map<Integer, Set<Integer>> followMap;
    private Map<Integer, List<int[]>> tweetMap;

    public Twitter() {
        time = 0;
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.putIfAbsent(userId, new ArrayList<>());
        tweetMap.get(userId).add(new int[]{time++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<int[]> feed = new ArrayList<>();
        if(tweetMap.get(userId)!=null){
            feed.addAll(tweetMap.get(userId));
        }
        Set<Integer> followers = followMap.get(userId);
        if(followers!=null){
            for(Integer id:followers){
                if(tweetMap.get(id)!=null){
                    feed.addAll(tweetMap.get(id));
                }
            }
        }
        feed.sort((a,b)->b[0] - a[0]);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < Math.min(10, feed.size()); i++) {
            res.add(feed.get(i)[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if (followerId != followeeId) {
            followMap.putIfAbsent(followerId, new HashSet<>());
            followMap.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        followMap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
