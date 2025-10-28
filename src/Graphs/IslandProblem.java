package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IslandProblem {


    //Treat it like a graph where 0 is water and 1 is a land node

    /**
     * 0    1    1    0
     * 0    1    1    0
     * 0    0    1    0
     * 0    0    0    0
     * 1    1    0    1
     * <p>
     * 3 islands
     */

    public static void main(String[] args) {
        IslandProblem islandProblem = new IslandProblem();
        int[][] arr = new int[10][10];
        int[][] visitedArray = new int[10][10];
        arr = new int[][]{{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};

        //initialising visited array with -1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                visitedArray[i][j] = -1;
            }
        }


        int islandCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (visitedArray[i][j] == -1 && arr[i][j] == 1) {
                    islandCount++;
                    checkBfsOnCurrentNode(i, j, arr, visitedArray);
                }
            }
        }


        //search for water and then start BFS on each island

        //Use Breadth first so in BFS we use queue
        System.out.println("count of island:" + islandCount);
    }

    public static void checkBfsOnCurrentNode(int i, int j, int[][] arr, int[][] visitedArray) {
        visitedArray[i][j] = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i, j));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
//check all neighbours of the node that was added to the queue
            for (int rowDel = -1; rowDel <= 1; rowDel++) {
                for (int colDel = -1; colDel <= 1; colDel++) {
                    int row = p.row + rowDel;
                    int col = p.col + colDel;
                    if (row >= 0 && col >= 0 && row < arr.length && col < arr[0].length && arr[row][col] == 1 && visitedArray[row][col] == -1) {
                        visitedArray[row][col] = 1;
                        queue.add(new Pair(row, col));
                    }
                }
            }
        }
    }


}



