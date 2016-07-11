//2016.07.11 62%
//https://codility.com/demo/results/training2MA4WV-C4S/

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int N = A.length;
        
        if (N == 0 || K == 0){
            return A;
        } 
        else {
            if (K <= N) {
                K %= N;
            }
        
            int[] R_A = new int[N];
        
            for(int i=0; i<N; i++){
                R_A[i] = (i<K) ? A[N+i-K]:A[i-K];
            }
            return R_A;
        }
        
    }
}