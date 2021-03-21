package algos;

import java.util.HashSet;
import java.lang.Math;

public class Algo {
    public int CountSumOfPairs(int[] array, int sum) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int count = 0;
        for (int value : array) {
            if(hashSet.contains(Math.abs(sum - value)))
                count++;
            hashSet.add(value);
        }
        return count;
    }

    public static void test() {
        int[][] arr = { 
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 },
            { 1, 1, 1, 0, 0, 0 } }; 
        System.out.println(maxHourGlass(arr));
    }
    static int maxHourGlass(int[][] arr) {
        int maxSum = -100;
        for(int i=0;i<4;++i){
            for(int j=0;j<4;++j){
                int temp=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+2]+arr[i+1][j+2]+arr[i+2][j+2];
                if (temp > maxSum)
                    maxSum = temp;
            }
        }
        return maxSum;
    }
}