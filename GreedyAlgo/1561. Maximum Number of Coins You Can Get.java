Problem: 1561. Maximum Number of Coins You Can Get
Medium
Question:There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
    In each step, you will choose any 3 piles of coins (not necessarily consecutive).
    Of your choice, Alice will pick the pile with the maximum number of coins.
    You will pick the next pile with maximum number of coins.
    Your friend Bob will pick the last pile.
    Repeat until there are no more piles of coins.

Given an array of integers piles where piles[i] is the number of coins in the ith pile.

Return the maximum number of coins which you can have.

Example 1:

Input: piles = [2,4,1,2,7,8]
Output: 9
Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
The maximum number of coins which you can have are: 7 + 2 = 9.
On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.


Hint: As i alwasy have to choose the 2nd last element and bob will take the last one,we can sort the pile and always take the 2nd largest element.For example:
sorted piles:[1,2,3,4,5,6]
here from [1,2,3] 2nd largest=2
from [4,5,6] 2nd largest=5
Ans=5+2=7

Solution:
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int sum=0;
        int c=0;
        for(int i=n-2;i>c;i-=2){
            sum+=piles[i];
            c++;
        }
        return sum;
    }
}