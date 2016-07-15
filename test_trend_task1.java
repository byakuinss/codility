//https://codility.com/c/feedback/CXPZZ3-UKS

import java.util.*;

class Solution {
    public int solution(int A, int B) {
        
        LinkedList<Integer> stack_A = new LinkedList<Integer>();
        LinkedList<Integer> stack_B = new LinkedList<Integer>();
        LinkedList<Integer> stack_C = new LinkedList<Integer>();
        
        if(A == 0){
            stack_A.push(0);
        } else {
            while(A > 0){
                stack_A.push( A % 10 );
                A /= 10;
            }
        }
        
        if(B == 0){
            stack_B.push(0);
        } else {
            while(B > 0){
                stack_B.push( B % 10 );
                B /= 10;
            }
        }
        
        while ((!stack_A.isEmpty())||(!stack_B.isEmpty())) {
            if(!stack_A.isEmpty()){
                stack_C.push( stack_A.pop());
            }
            if(!stack_B.isEmpty()){
                stack_C.push( stack_B.pop());
            }
        }
        
        int c = 0;
        int count = 0;
        while (!stack_C.isEmpty()){
            c += (stack_C.pop()) * Math.pow(10,count);
            count ++;
        }
        
        if(c > 100000000){
            return -1;
        }
        
        return c;
        
    }
}