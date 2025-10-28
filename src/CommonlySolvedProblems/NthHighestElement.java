package CommonlySolvedProblems;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NthHighestElement {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 4, 2, 3, 9, 1);

        int k = 3;// 3rd highest element in the array

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(list.subList(0, k));

        for (int i = k; i < list.size(); i++) {
            if(list.get(i)> priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(list.get(i));
            }
        }

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

    }
}
