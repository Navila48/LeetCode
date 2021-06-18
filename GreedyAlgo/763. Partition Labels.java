
    1.traverse the string record the last index of each char.
    2.traverse the string again until found last character
    3.If found store the length and start again step 2

class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s.length()==0 || s==null)
            return null;
        int[]seen=new int[26];
        List<Integer>list=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++)
            seen[s.charAt(i)-'a']=i;
        
        int last=0,start=0;
        for(int i=0;i<n;i++){
            last=Math.max(last,seen[s.charAt(i)-'a']);
            if(last==i){
                list.add(last-start+1);
                start=last+1;
            }
        }
        return list;
    }
}