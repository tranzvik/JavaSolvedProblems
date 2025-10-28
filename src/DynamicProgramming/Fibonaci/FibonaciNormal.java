package DynamicProgramming.Fibonaci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonaciNormal {


    public static void main(String[] args) {
        FibonaciNormal fibonaciNormal = new FibonaciNormal();
        int[] dpList = new int[50];
        Arrays.fill(dpList, -99);
        // Collections.fill(dpList, Integer.valueOf(0));
        int res = fibonaciNormal.getFibonaci(6, dpList);
        System.out.println(res);
    }


    // 0 1 1 2 3 5 8 13 21 34
    private int getFibonaci(int n, int[] dpList) {
        if (n <= 1) {
            return dpList[n] = n;// optimal approach
        } else if (dpList[n] != -99) {
            return dpList[n];
        } else {
            return dpList[n] = getFibonaci(n - 1, dpList) + getFibonaci(n - 2, dpList);
        }
    }
}
