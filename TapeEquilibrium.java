//2016.07.13 100%
//https://codility.com/demo/results/trainingB66FU5-9M7/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int sum_a = 0;
        int sum_b = 0;
        int min_diff = 99999;
        int diff = 0;
        
        for(int i=0; i<A.length; i++){
            sum_b += A[i];
        }
        
        diff = Math.abs(sum_a - sum_b);
        for(int P=0; P<A.length-1; P++){
            sum_a += A[P];
            sum_b -= A[P];
            diff = Math.abs(sum_a - sum_b);
            if(diff < min_diff){
                min_diff = diff;
            }
        }
        
        return min_diff;
    }
}