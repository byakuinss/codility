//2016.07.14 100%
//https://codility.com/demo/results/trainingJYR4WB-FC4/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int count = 1;
        
        for(int i=0; i<N; i++){
            if (A[i] != count){
                return 0;
            } 
            count ++;
        }
        return 1;
    }
}