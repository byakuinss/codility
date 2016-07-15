// 2016.07.15 76%
//https://codility.com/demo/results/demoVMJMEJ-FRX/

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int P = -1;
        
        int sum_left = 0;
        int sum_right = 0;
        
        for(int i=0; i<N; i++){
            sum_right += A[i];
            System.out.println("sum_right:" + sum_right);
        }
        
        for(int i=0; i<N; i++){
            P = A[i];
            System.out.println("P:" + P);
            if (i!=0){
                sum_left += A[i-1];
                System.out.println("sum_left:" + sum_left);
            }
            sum_right -= P;
            System.out.println("sum_right:" + sum_right);
            if(sum_left == sum_right){
                return i;
            }
        }
        
        return -1;
    }
}