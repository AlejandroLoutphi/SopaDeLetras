/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

class BreadthFirstSearchQueueEntry {

    private int entry;
    private boolean[] taken;

    public BreadthFirstSearchQueueEntry(
            int entry,
            boolean[] taken) {
        this.entry = entry;
        this.taken = taken;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public boolean[] getTaken() {
        return taken;
    }

    public void setTaken(boolean[] taken) {
        this.taken = taken;
    }

}

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

    /**
     * Traverses the graph from an entry point to find a connected sequence of
     * vertices that contain the elements of the array passed in from an index
     * onward using a depth-first search (DFS).
     *
     * @param arr   array of elements
     * @param index index that specifies the first element of the array to search
     *              for
     * @param entry graph vertex index; vertex from which to start the search
     * @param taken mask that specifies which graph vertices are taken and therefore
     *              can't be part of the sequence this function searches for
     * @return true if the vertex sequence was found. Otherwise, false
     */
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
     * Traverses the graph to find a connected sequence of vertices that contain the
     * elements of the array passed in using a depth-first search (BFS).
     * 
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

    /**
     * Traverses the graph to find a connected sequence of vertices that contain the
     * elements of the array passed in using a breadth-first search (BFS), starting
     * from a specified vertex.
     * 
     * @param arr array of elements
     * @param inputEntry graph vertex index specifying where the sequence begins
     * @return true if the vertex sequence was found. Otherwise, false
     */
    private boolean breadthFirstSearchArrayFromEntry(
            E[] arr,
            int inputEntry) {
        int entry;
        boolean[] taken = new boolean[this.elts.length];
        taken[inputEntry] = true;
        boolean[] nextTaken;
        NodeQueue<BreadthFirstSearchQueueEntry> prevLayerQueue = new NodeQueue<>();
        NodeQueue<BreadthFirstSearchQueueEntry> nextLayerQueue = new NodeQueue<>();
        BreadthFirstSearchQueueEntry queueEntry;

        prevLayerQueue.enqueue(new BreadthFirstSearchQueueEntry(inputEntry, taken));

        for (int j = 1; j < arr.length; j++) {
            while (!prevLayerQueue.isEmpty()) {
                queueEntry = prevLayerQueue.dequeue().getElt();
                entry = queueEntry.getEntry();
                taken = queueEntry.getTaken();

                for (int k = 0; k < this.elts.length; k++) {
                    if (!this.hasEdge(entry, k) || (this.get(k) != arr[j]) || taken[k]) {
                        continue;
                    }

                    if (j == (arr.length - 1)) {
                        return true;
                    }

                    nextTaken = taken.clone();
                    nextTaken[k] = true;
                    nextLayerQueue.enqueue(new BreadthFirstSearchQueueEntry(k, nextTaken));
                }
            }
            prevLayerQueue = nextLayerQueue;
            nextLayerQueue = new NodeQueue<>();
        }

        return false;
    }

    /**
     * Traverses the graph to find a connected sequence of vertices that contain the
     * elements of the array passed in using a breadth-first search (BFS).
     * 
     * @param arr array of elements
     * @return true if the vertex sequence was found. Otherwise, false
     */
    public boolean breadthFirstSearchArray(E[] arr) {
        for (int i = 0; i < this.elts.length; i++) {
            if (!this.get(i).equals(arr[0]))
                continue;
            if (this.breadthFirstSearchArrayFromEntry(arr, i))
                return true;
        }
        return false;
    }
}
