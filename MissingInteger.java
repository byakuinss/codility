//2016.07.14 100%
//https://codility.com/demo/results/trainingPCGCWH-28B/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        
        int count = 1;
        for (int element : A){
            if(element == count){
                count ++;
            }
        }
        
        return count;
    }
}