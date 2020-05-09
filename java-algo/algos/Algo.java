package algos;

import java.util.HashSet;

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
}