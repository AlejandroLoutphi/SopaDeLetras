/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import java.util.LinkedList;
import java.util.Queue;





class GFG {
    // Let the given dictionary be following
    static final String dictionary[] = { "GEEKS", "FOR", "QUIZ", "GUQ", "EE" };
    static final int n = dictionary.length;
    static final int M = 3, N = 3;

    // A given function to check if a given string is present in
    // dictionary. The implementation is naive for simplicity. As
    // per the question dictionary is given to us.
    static boolean isWord(String str) {
        // Linearly search all words
        for (int i = 0; i < n; i++)
            if (str.equals(dictionary[i]))
                return true;
        return false;
    }

    // A BFS function to print all words present on boggle
    static void findWordsUtil(char boggle[][], int i, int j) {
        // Directions to move in the 8 adjacent cells
        int[] rowNum = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNum = {-1, 0, 1, -1, 1, -1, 0, 1};

        // Queue for BFS
        Queue<BoggleNode> queue = new LinkedList<>();

        // Start with the initial cell
        queue.add(new BoggleNode(i, j, "" + boggle[i][j], new boolean[M][N]));

        while (!queue.isEmpty()) {
            BoggleNode node = queue.poll();

            // Mark this cell as visited
            node.visited[node.row][node.col] = true;

            // If the current string is a valid word, print it
            if (isWord(node.str)) {
                System.out.println(node.str);
            }

            // Traverse 8 adjacent cells
            for (int k = 0; k < 8; k++) {
                int newRow = node.row + rowNum[k];
                int newCol = node.col + colNum[k];

                if (isValid(newRow, newCol, node.visited)) {
                    boolean[][] newVisited = copyArray(node.visited);
                    queue.add(new BoggleNode(newRow, newCol, node.str + boggle[newRow][newCol], newVisited));
                }
            }
        }
    }

    // Check if a cell (row, col) is valid and not visited
    static boolean isValid(int row, int col, boolean visited[][]) {
        return (row >= 0) && (row < M) && (col >= 0) && (col < N) && (!visited[row][col]);
    }

    // Utility function to copy a 2D array
    static boolean[][] copyArray(boolean[][] src) {
        boolean[][] dst = new boolean[src.length][src[0].length];
        for (int i = 0; i < src.length; i++) {
            System.arraycopy(src[i], 0, dst[i], 0, src[i].length);
        }
        return dst;
    }

    // Prints all words present in dictionary.
    static void findWords(char boggle[][]) {
        // Consider every character and look for all words
        // starting with this character
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                findWordsUtil(boggle, i, j);
    }

    // Driver program to test above function
    public static void main(String args[]) {
        char boggle[][] = { { 'G', 'I', 'Z' },
                            { 'U', 'E', 'K' },
                            { 'Q', 'S', 'E' } };

        System.out.println("Following words of dictionary are present");
        findWords(boggle);
    }
}

// A class to represent a node in BFS
class BoggleNode {
    int row, col;
    String str;
    boolean visited[][];

    public BoggleNode(int row, int col, String str, boolean visited[][]) {
        this.row = row;
        this.col = col;
        this.str = str;
        this.visited = visited;
    }
}

