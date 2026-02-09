class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i =0;i<intervals.length;i++){
            int nextstart = intervals[i][0];
            int nextend = intervals[i][1];

            if(nextstart <= end){
                end = Math.max(end,nextend);
            }
            else{
                res.add(new int[]{start,end});
                start = nextstart;
                end = nextend;

            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
        
    }
}