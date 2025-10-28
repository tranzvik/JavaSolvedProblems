package CommonlySolvedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 6, 1, 7, 23,3 ,1);
        List<Integer> list2 = new ArrayList<>();
        list2 = list1.stream().sorted((s1, s2) -> s1.compareTo(s2)).toList();
        list2.stream().forEach(System.out::println);

        System.out.println(list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

    }
}
