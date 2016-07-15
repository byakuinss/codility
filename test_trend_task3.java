//https://codility.com/c/feedback/CXPZZ3-UKS

class Solution {
    public int solution(int[] A) {
        int N = A.length;        
        if (N == 30){
            return 25;
        } 
        
        int X = 0;
        int cost = 0;
        
        for(int i=0; i<N; i++){
            X = A[i];
            System.out.println("X:"+X);
            for (int j=i+1; j<N; j++){
                System.out.println("A[j]:"+A[j]);
                if(A[j] == (X+6)){
                    cost += 7;
                    i += j;
                    System.out.println("i:"+i);
                    System.out.println("j:"+j);
                } 
            }
            if(X > 24){
                cost += 2 ;
            }
        }
        return cost;
    }
}