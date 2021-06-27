Solution: At first iterate over rowsum and colsum and find the smallest number
put the smallest number in the result array
subtract the smallest from rowsum and colsum.

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rl=rowSum.length;
        int cl=colSum.length;
        int[][]res=new int[rl][cl];
        
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                int small=Math.min(rowSum[i],colSum[j]);
                res[i][j]=small;
                rowSum[i]-=small;
               colSum[j]-=small;
            }
            
        }
        return res;
    }
}