package CommonlySolvedProblems;


import java.util.*;

/**
 * Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero.
 * In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i,
 * and their sum is equal to zero.
 * <p>
 * Input:
 * nums = [-1,0,1,2,-1,-4]
 * <p>
 * Output:
 * [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSumProblem {

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        // ThreeSumProblem.bruteForceApproach(arr);
        ThreeSumProblem.betterApproach(arr);

    }


    public static void betterApproach(int arr[]) {
        /*HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
        HashSet<Integer> tempSet = new HashSet<>();
        List<Integer> tempList = new ArrayList<>();

        //Brute Force approach--Needs to be unique
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

            }
        }*/
        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = 0 -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        System.out.println(ans);
    }

    public static void bruteForceApproach(int arr[]) {
        HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
        List<Integer> tempList = new ArrayList<>();

        //Brute Force approach--Needs to be unique
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        tempList = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(tempList);
                        uniqueTriplets.add(tempList);
                    }
                }
            }

        }
        System.out.println(uniqueTriplets);
    }
}
