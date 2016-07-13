//2016.07.13 100%
//https://codility.com/demo/results/training3U895D-XZY/

class Solution {
    public int solution(int X, int Y, int D) {
        int mod = (Y-X)%D;
        if (mod == 0){
            return (Y-X)/D;
        } else {
            return ((Y-X)/D) + 1;
        }
    }
}