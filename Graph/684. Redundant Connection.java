684. Redundant Connection
In this problem, a tree is an undirected graph that is connected and has no cycles.
You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.
Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.

Example 1:
Input: edges = [[1,2],[1,3],[2,3]]
Output: [2,3]

Example 2:
Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
Output: [1,4]

Hint:Use union find algorithm to find cycle,for any edge id found cycle return it.

Helpful link to learn union find:
https://www.hackerearth.com/practice/notes/disjoint-set-union-union-find/
https://helloacm.com/the-union-find-disjoint-set-implementation-in-java/

Solution:
class Solution {
    int[]res=new int[2];
        int[]parent;
    public int[] findRedundantConnection(int[][] edges) {
         res[0]=0;
        res[1]=0;
    
        int n=edges.length;
      parent =new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
           union(x,y);
        }
        return res;
    }
    public void union(int x,int y){
        int px=findRoot(x);
        int py=findRoot(y);
        if(px!=py){
            parent[px]=py;
        }else{
            res[0]=x;
            res[1]=y;
        }
    }
    public int findRoot(int x){
        if(x==parent[x])
            return x;
        return parent[x]=findRoot(parent[x]);
    }
}