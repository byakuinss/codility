//2016.07.14 100%
//https://codility.com/demo/results/trainingB6YEEK-K59/

class Solution {
    public int solution(int X, int[] A) {
        int N = A.length;
        int count = X;
        
        boolean[] leaf_pos = new boolean[count+1];
        
        for (int i=0; i<N; i++){
            if(!leaf_pos[A[i]]){
                leaf_pos[A[i]] = true;
                count -- ;
            }
            if(count == 0){
                return i;
            }
        }
        return -1;
    }
}