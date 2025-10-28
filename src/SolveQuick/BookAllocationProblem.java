package SolveQuick;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Input Format:
 * n = 5, m = 4, arr[] = {25,46,28,49,24}
 * Result:
 * 71
 * Explanation:
 * Cond: Each student should get atleast one book
 */


public class BookAllocationProblem {


    public static void main(String[] args) {

        List<Integer> bookList = Arrays.asList(25, 46, 28, 49, 24);
        int noOfStudents = 4;

        int maxPages = Collections.max(bookList);  //49

        int result=0;
        int totalPages = bookList.stream().collect(Collectors.summingInt(x -> x));//72


        for (int i = maxPages; i < totalPages; i++) {
            int count = getCountOfStudentsWithBookAllocated(bookList, i);
            if (count == noOfStudents) {
                result = i;
            }
        }
        System.out.println("Min Pages:"+ result);

    }

    public static int getCountOfStudentsWithBookAllocated(List<Integer> bookList, int maxPagesAllowed) {
        int countOfStudentsWithBookAllocated = 1;
        int currentPagesWithStudent = 0;

        for (int j = 0; j < bookList.size() - 1; j++) {
            if ((currentPagesWithStudent + bookList.get(j)) < maxPagesAllowed) {
                //addpage to current student
                currentPagesWithStudent += bookList.get(j);
            } else {
                //addpage to next student
                countOfStudentsWithBookAllocated++;
                currentPagesWithStudent = bookList.get(j);
            }
        }


        return countOfStudentsWithBookAllocated;
    }
}
