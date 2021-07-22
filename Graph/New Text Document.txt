547. Number of Provinces
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.A province is a group of directly or indirectly connected cities and no other cities outside of the group.You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
Return the total number of provinces.
Example 1:
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2

Example 2:
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3

hint:
travers all connected node and make it visited.then check every cities if its visited or not and count accordingly.

class Solution {
    public int findCircleNum(int[][] isConnected) {
       int n=isConnected.length;
       int[]seen=new int[n];
        int count=0;
//traverse cities.
        for(int i=0;i<n;i++){
           if(seen[i]==0){
               dfs(isConnected,seen,i);
               count++;
           }
        }
        return count;
    }
    public void dfs(int[][]isConnected,int[]seen,int i){
//traverse connected nodes.
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && seen[j]==0){
                seen[j]=1;
                dfs(isConnected,seen,j);
            }
        }
    }
}