class Solution {
    public int findMinArrowShots(int[][] points) {
     int n=points.length;
     if(n==0) return 0;

     Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
     int arrowPos=points[0][1];
     int arrowCnt=1;
     for(int i=1;i<n;i++){
        if(arrowPos>=points[i][0]){
            continue;
        }
        arrowCnt++;
        arrowPos=points[i][1];
     }
     return arrowCnt;
    }
}