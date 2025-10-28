package CommonlySolvedProblems;

public class SubarrayWithGivenSum {


    public static void main(String[] args) {
        
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;

        int startIndex = 0, endIndex = 0, currentSum = 0;

        while (startIndex < arr.length || endIndex < arr.length) {
            currentSum += arr[endIndex];

            if (currentSum == target) {
                System.out.println("index:" + startIndex + ":" + endIndex);
                break;
            } else if (currentSum > target) {
                startIndex++;
                endIndex = startIndex;
                currentSum = 0;
            } else {
                endIndex++;
            }

        }

    }
}
