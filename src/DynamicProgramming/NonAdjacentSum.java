package DynamicProgramming;


import java.util.Arrays;

//You are given a list of numbers and you need to return the maximum sum of the subsequence with the constraint
// that no two elements are adjacent in the given arraylist.  //2 1 4 9 -->11
public class NonAdjacentSum {



    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};

        int[] dpArr = new int[arr.length];
        Arrays.fill(dpArr, -1);
        System.out.println(new NonAdjacentSum().getMaxNonAdjacentSum(arr.length - 1, arr, dpArr));
    }

    //Always bottom up approach
    //Solve this problem using pick and not pick. If u pick current element

    //Complexity is 2 ^n as the function is called twice and on each index.
    public int getMaxNonAdjacentSum(int index, int[] arr, int[] dpArr) {

        if (index == 0) {
            return arr[index];   // Why not 0 becaue when we reach index 0 recursively means we have not picked index 1.
            //because if we had picked index 1, we would have done -2 and gone to -1 and not 0 as per below line.
        }

        if (index < 0) {
            return 0;
        }

        if (dpArr[index] != -1) {
            return dpArr[index];
        }

        int pick = arr[index] + getMaxNonAdjacentSum(index - 2, arr, dpArr);
        int notPick = 0 + getMaxNonAdjacentSum(index - 1, arr, dpArr);

        return dpArr[index] = Math.max(pick, notPick);
    }

}
