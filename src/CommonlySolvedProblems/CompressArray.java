package CommonlySolvedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompressArray {

    public static void main(String[] args) {

        //[2,3,3,7,3,5], k = 20 o/p =3

        /**
         * [2,3,3,7,3,5] -> [6,3,7,3,5]
         * 2. [6,3,7,3,5] -> [18,7,3,5]
         * 3. [18,7,3,5] -> [18,7,15]
         */
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 3, 7, 3, 5));
        int k = 20;

        int count = 0;
        int idx = 0;


        while (idx < list1.size() - 1) {
            int product = list1.get(idx) * list1.get(idx + 1);

            if (product < 20) {
                list1.remove(idx + 1);
                list1.remove(idx);
                list1.add(idx, product);
                count++;

            } else {
                idx++;
            }
        }

        System.out.println(list1);
        System.out.println(count);
    }
}
