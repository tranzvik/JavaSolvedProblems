package CommonlySolvedProblems;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArrays {

    public static void main(String[] args) {
       // int[] arr1 = {1, 3, 4, 5};
       // int[] arr2 = {2, 4, 6, 8};

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        List<Integer> result = new ArrayList<>();


        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] < arr2[idx2]) {
                result.add(arr1[idx1]);
                idx1++;
            } else {
                result.add(arr2[idx2]);
                idx2++;
            }
        }

        while (idx1 < arr1.length) {
            result.add(arr1[idx1++]);
        }

        while (idx2 < arr2.length) {
            result.add(arr2[idx2++]);
        }

        System.out.println(result);


    }
}
