package Graphs;

import java.nio.file.Paths;
import java.util.*;

public class GraphDFS {

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

        List<Integer> visitedList = new ArrayList<>(adjacencyList.size());

        for (int i = 0; i <= adjacencyList.size(); i++) {
            visitedList.add(-1);
        }

        int src = 1;
         dfs(adjacencyList, visitedList, src);

      //  System.out.println(result);
    }

    public static void dfs(Map<Integer, List<Integer>> adjacencyList, List<Integer> visitedList, int src) {


        //dfsResult.add(src);
        System.out.println(src+" ");
        visitedList.set(src, 1);

        for (int elem : adjacencyList.get(src)) {
            if (visitedList.get(elem) == -1) {
                visitedList.set(elem, 1);
                dfs(adjacencyList, visitedList, elem);
            }
        }


    }
}
