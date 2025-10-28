package Graphs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GraphBFS {

    /*

             1
       2             6
    3     4     7        9
         5 --------8


     */

    //Needs QUEUE  FIFO
    public static void main(String[] args) {

        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();
        adjacencyList.put(1, Arrays.asList(2, 6));
        adjacencyList.put(2, Arrays.asList(1, 3, 4));
        adjacencyList.put(3, Arrays.asList(2));
        adjacencyList.put(4, Arrays.asList(2, 5));
        adjacencyList.put(5, Arrays.asList(4, 8));
        adjacencyList.put(6, Arrays.asList(1, 7, 9));
        adjacencyList.put(7, Arrays.asList(6, 8));
        adjacencyList.put(8, Arrays.asList(5, 7));
        adjacencyList.put(9, Arrays.asList(6));

        int src = 1;
        List<Integer> result = bfs(adjacencyList, src);

        System.out.println(result);
    }

    public static List<Integer> bfs(Map<Integer, List<Integer>> adjacencyList, int src) {
        List<Integer> visitedList = new ArrayList<>(adjacencyList.size());

        for(int i=0;i<=adjacencyList.size(); i++){
            visitedList.add(-1);
        }
        List<Integer> bfsResult = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visitedList.set(src, 1);


        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.add(node);

            for (int elem : adjacencyList.get(node)) {
                if (visitedList.get(elem) == -1) {
                    visitedList.set(elem, 1);
                    queue.add(elem);
                }
            }
        }

        return bfsResult;
    }
}
