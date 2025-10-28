package CommonlySolvedProblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 4, 2, 3, 9, 1,1,9,4,9);

        // Map<Integer,Integer> m=   list.stream().collect(Collectors.toMap(x-> x, x->x*2));
        Map<Integer, Long> m = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        System.out.println(m);
    }
}
