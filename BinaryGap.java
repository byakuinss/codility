//https://codility.com/demo/results/trainingGSCPMF-HN7/

import java.util.*;

class Solution {
    public int solution(int N) {
        String bin_n = Integer.toBinaryString(N);
        String[] bin = bin_n.split("(?=1)(?<=0)|(?=0)(?<=1)");
        
        int len = 0;
        int max_len = 0;
        for(int i=0; i< bin.length-1; i++){
            if(bin[i].toString().contains("0")){
                len = bin[i].toString().length();
                if(len > max_len){
                    max_len = len;
                }
            }
        }
        return max_len;
    }
}