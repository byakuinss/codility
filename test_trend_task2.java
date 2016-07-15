//https://codility.com/c/feedback/CXPZZ3-UKS

import java.util.*;

class Solution {
    public String solution(int A, int B, int C, int D) {
        int[] list = {A,B,C,D};
        int[] Time = new int[4];
        Arrays.sort(list);
        
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        
        //find T0
        for(int i = 0; i < list.length; i++){
            if(list[i] >= 0 && list[i] <= 2){
                Time[0] = list[i];
                list[i] = -1;
                break;
            }
        }
        
        //find T1
        switch(Time[0]){
            case 2: {
                for(int i = 0; i < list.length; i++){
                    if(list[i] != -1){
                        if(list[i] >= 0 && list[i] <= 3){
                            Time[1] = list[i];
                            list[i] = -1;
                            break;
                        }
                    }
                }
                break;
            }
            case 1:
            case 0: {
                for(int i = 0; i < list.length; i++){
                    if(list[i] != -1){
                        Time[1] = list[i];
                        list[i] = -1;
                        break;
                    }
                }
                break;
            }
        }
        
        //find T2
        for(int i = 0; i < list.length; i++){
            if(list[i] != -1){
                if(list[i] >= 0 && list[i] <=5){
                    Time[2] = list[i];
                    list[i] = -1;
                    break;
                }
            }
        }
        //find T3
        for(int i = 0; i < list.length; i++){
            if(list[i] != -1){
                Time[3] = list[i];
                list[i] = -1;
                break;
            }
        }
        
        //check 
        for(int value: list){
            if(value != -1){
                return "NOT POSSIBLE";
            }
        }
        
        String result = "";
        result = "" + Time[0] + "" + Time[1] + ":" + Time[2] + Time[3];
        System.out.println(result);
        return result;
    }
}