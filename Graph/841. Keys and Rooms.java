841. Keys and Rooms
There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 
Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.Initially, all the rooms start locked (except for room 0).You can walk back and forth between rooms freely.
Return true if and only if you can enter every room.

Example 1:

Input: [[1],[2],[3],[]]
Output: true
Explanation:  
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.

Example 2:

Input: [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can't enter the room with number 2.

Hint:
First room 0 is seen. from room 0,traverse all the other adjacent room i mean from from room 0 traverse the adjacent list and make it seen.
Check if all the rooms are seen or not and return accordingly.

Solution:

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer>dfs=new Stack<>();
        dfs.add(0);
        HashSet<Integer>seen=new HashSet<>();
        seen.add(0);
        while(!dfs.isEmpty()){
            int room=dfs.pop();
            for(int key:rooms.get(room)){
                if(!seen.contains(key)){
                    dfs.push(key);
                    seen.add(key);
                    if(rooms.size()==seen.size())
                        return true;
                }
            }
        }
        return rooms.size()==seen.size();
    }
}