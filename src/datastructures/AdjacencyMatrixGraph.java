/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 * Graph class.
 * Elements (vertices) are immutable.
 * Implemented using an adjacency matrix.
 * 
 * @author Alejandro Loutphi
 */
public class AdjacencyMatrixGraph<E> {

    private boolean[][] adjacencyMatrix;
    private final E[] elts;

    /**
     * Construct graph with the elements in the input array and no edges.
     * 
     * @param elts array of elements to be contained in the graph vertices
     */
    public AdjacencyMatrixGraph(E[] elts) {
        this.elts = elts;
        int eltsLen = this.elts.length;
        this.adjacencyMatrix = new boolean[eltsLen][eltsLen];
    }

    /**
     * Returns the element of the nth graph vertex.
     * 
     * @param n index of the vertex to return the element from
     * @return element housed in nth vertex
     */
    public E get(int n) {
        return this.elts[n];
    }

    /**
     * Connects the vertex with index a to the vertex with index b unidirectionally.
     * 
     * @param a vertex index
     * @param b vertex index
     */
    public void linkAToB(int a, int b) {
        this.adjacencyMatrix[a][b] = true;
    }

    /**
     * Connects the vertex with index a to the vertex with index b bidirectionally.
     * 
     * @param a vertex index
     * @param b vertex index
     */
    public void linkAAndB(int a, int b) {
        linkAToB(a, b);
        linkAToB(b, a);
    }

    /**
     * Construct graph with the elements in the input array.
     * The vertices are connected as if they were in a square.
     * Each vertex connects to the elements vertically, horizontally, and diagonally
     * adjacent to itself inside the square.
     * 
     * @param elts    array of elements to be contained in the graph vertices
     * @param sideLen side length of the square the graph is simulating. Must be
     *                equal to the square root of elts.length
     */
    public AdjacencyMatrixGraph(E[] elts, int sideLen) {
        this.elts = elts;
        int eltsLen = this.elts.length;
        this.adjacencyMatrix = new boolean[eltsLen][eltsLen];
        int sideLenM1 = sideLen - 1;
        int sideLenP1 = sideLen + 1;
        assert (eltsLen == (sideLen * sideLen));
        for (int i = 0; i < eltsLen; i++) {
            if (i % sideLen != 0)
                this.linkAAndB(i, i - 1);
            if (i / sideLen != 0)
                this.linkAAndB(i, i - sideLen);
            if ((i % sideLen != 0) && (i / sideLen != 0))
                this.linkAAndB(i, i - sideLenP1);
            if ((i % sideLen != 0) && (i / sideLen != sideLenM1))
                this.linkAAndB(i, i + sideLenM1);
        }
    }

    /**
     * Returns true if the graph is directed (not all edges are bidirectional).
     * 
     * @return true if the graph is directed. Otherwise, false
     */
    public boolean isDirected() {
        for (int i = 0; i < this.elts.length; i++) {
            for (int j = 0; j < i; j++) {
                if (this.adjacencyMatrix[i][j] != this.adjacencyMatrix[j][i])
                    return true;
            }
        }
        return false;
    }

    /**
     * Returns true if there's an edge connecting i and j
     * 
     * @param i Vertex index
     * @param j Vertex index
     * @return true if there's an edge connecting i and j
     */
    public boolean hasEdge(int i, int j) {
        int numVertices = this.elts.length;
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            return adjacencyMatrix[i][j];
        }
        return false;
    }

    private boolean depthFirstSearchStep(
            E[] arr,
            int index,
            int entry,
            boolean[] taken) {
        if (index == arr.length)
            return true;
        taken[entry] = true;
        for (int i = 0; i < this.elts.length; i++) {
            if (!this.hasEdge(entry, i) || (this.get(i) != arr[index]) || taken[i]) {
                continue;
            }
            if (depthFirstSearchStep(arr, index + 1, i, taken)) {
                return true;
            }
        }
        taken[entry] = false;
        return false;
    }

    /**
     * Traverses the graph to find a connected sequece of vertices that contain the elements of the array passed in.
     * @param arr array of elements
     * @return true if the vertex sequence was found. Otherwise, false
     */
    public boolean depthFirstSearchArray(E[] arr) {
        boolean[] taken = new boolean[this.elts.length];
        for (int i = 0; i < this.elts.length; i++) {
            if (!this.get(i).equals(arr[0])) {
                continue;
            }
            if (depthFirstSearchStep(arr, 1, i, taken))
                return true;
        }
        return false;
    }

    // // BFS word search method
    // public boolean searchWordBFS(String word) {
    // if (word == null || word.isEmpty()) {
    // return false;
    // }

    // for (int start = 0; start < elts.length; start++) {
    // if (elts[start].equals(word.charAt(0))) {
    // boolean[] visited = new boolean[elts.length];
    // Queue<int[]> queue = new LinkedList<>();
    // queue.add(new int[]{start, 1});
    // visited[start] = true;

    // while (!queue.isEmpty()) {
    // int[] current = queue.poll();
    // int vertex = current[0];
    // int index = current[1];

    // if (index == word.length()) {
    // return true; // All characters matched
    // }

    // for (int i = 0; i < elts.length; i++) {
    // if (adjacencyMatrix[vertex][i] && !visited[i] &&
    // elts[i].equals(word.charAt(index))) {
    // visited[i] = true;
    // queue.add(new int[]{i, index + 1});
    // }
    // }
    // }
    // }
    // }

    // return false;
    // }
}
