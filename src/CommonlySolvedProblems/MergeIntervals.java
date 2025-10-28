package CommonlySolvedProblems;

//Pre-Order Traversal

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Example 1:
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * <p>
 * Example 2:
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeIntervals {

    public static void main(String[] args) {


        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};  //o/p is {7, 8} {1,6}
        List<int[]> result = new ArrayList<>();


        Arrays.sort(arr, (a1, a2) -> Integer.compare(a1[0], a2[0]));

        //{1, 5},  {2, 4},  {4, 6},  {7, 8}
       // Arrays.asList(arr).stream().forEach(x -> System.out.println(x[0] + " " + x[1]));
        result.add(arr[0]);
        System.out.println(result);

        for (int i = 1; i < arr.length; i++) {
            int[] lastMerged = result.get(result.size() - 1);
            System.out.println("last merged:"+ lastMerged[0]+"   "+lastMerged[1]);

            int[] currInterval = arr[i];
            System.out.println("current Interval:"+ currInterval[0]+"   "+currInterval[1]);

            if (currInterval[0] < lastMerged[1]) {
                lastMerged[1] = Math.max(lastMerged[1], currInterval[1]); //array reference
            } else {
                result.add(new int[]{currInterval[0], currInterval[1]});
            }
           // result.stream().forEach(x -> System.out.println(x[0] + " " + x[1]));
        }

        result.stream().forEach(x -> System.out.println(x[0] + " ---" + x[1]));

        //


    }
}
