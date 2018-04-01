class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        //if only one node - return the node
        if(n==1) return Collections.singletonList(0);
                
        //list of set to maintain a connected nodes
        List<Set<Integer>> list = new ArrayList<>();
        
        //list initialization
        for(int i = 0; i < n; i++)  list.add(i, new HashSet<Integer>());
        for(int[] edge : edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        
        //finding leaves
        List<Integer> leaves = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(list.get(i).size()==1){
                leaves.add(i);
            }
        }
        
        //removing leaves and finding next set of leaves
        while(n>2){
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int leaf: leaves){
                int neighbor = list.get(leaf).iterator().next();
                list.get(neighbor).remove(leaf);
                if(list.get(neighbor).size()==1)    newLeaves.add(neighbor);
            }
            leaves = newLeaves;
        }
        
        return leaves;
    }
}
