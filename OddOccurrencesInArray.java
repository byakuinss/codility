//2016.07.12 66%
//https://codility.com/demo/results/trainingJ8S76W-4WW/
//2016.07.12.02 100%
//https://codility.com/demo/results/trainingK9HK7K-T87/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        //int[][] array = new int[N][2];
        
        if(N == 0){
            return 0;
        }
        
        if(N % 2 == 0){
            return 0;
        }
        
        int unpair = 0;
        
        //Arrays.sort(A);
        for (int compare : A){
            unpair ^= compare;
        }
        
        return unpair;
    }
}