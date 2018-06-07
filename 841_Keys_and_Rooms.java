class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //Simple BFS approach
        
        Set<Integer> set = new HashSet<Integer>();
        set.add(0);
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(0);
        
        while(!q.isEmpty() && set.size()!=rooms.size()){
            int cur = q.poll();
            List<Integer> keys = rooms.get(cur);
            for(int key: keys){
                if(!set.contains(key)){
                    set.add(key);
                    q.offer(key);
                }
            }
        }
        
        
        return set.size()==rooms.size();
    }
}
