//2016.07.12 100%
//https://codility.com/demo/results/trainingYSX5FV-98G/

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int N = A.length;
        
        if (N == 0 || K == 0){
            return A;
        } 
        else {
            int[] R_A = new int[N];
        
            for(int i=0; i<N; i++){
                R_A[(i+K)%N] = A[i];
            }
            return R_A;
        }
        
    }
}