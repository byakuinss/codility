//2016.07.13 100%
//https://codility.com/demo/results/trainingT7DSDC-PJC/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int count = 1;        
        Arrays.sort(A);
        for(int i=0; i < A.length; i++){
            if(count != A[i]){
                return count;
            }
            count ++;
        }
        return count;
    }
}