/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletras;

/**
 *
 * @author Alejandro Loutphi
 */
public class AdjacencyMatrixGraph<E> {

    private boolean[][] adjacencyMatrix;
    private final E[] elts;

    public E get(int n) {
        return this.elts[n];
    }

    public void linkAToB(int a, int b) {
        this.adjacencyMatrix[a][b] = true;
    }

    public void linkAAndB(int a, int b) {
        linkAToB(a, b);
        linkAToB(b, a);
    }

    public AdjacencyMatrixGraph(E[] elts, int sideLen) {
        this.elts = elts;
        int square = this.elts.length;
        this.adjacencyMatrix = new boolean[square][square];
        int sideLenM1 = sideLen - 1;
        int sideLenP1 = sideLen + 1;
        assert(square == (sideLen * sideLen));
        for (int i = 0; i < square; i++) {
            if (i % sideLen != 0) {
                this.linkAAndB(i, i - 1);
            }
            if (i / sideLen != 0) {
                this.linkAAndB(i, i - sideLen);
            }
            if ((i % sideLen != 0) && (i / sideLen != 0)) {
                this.linkAAndB(i, i - sideLenP1);
            }
            if ((i % sideLen != 0) && (i / sideLen != sideLenM1)) {
                this.linkAAndB(i, i + sideLenM1);
            }
        }
    }

    public boolean isDirected() {
        for (int i = 0; i < this.elts.length; i++) {
            for (int j = 0; j < i; j++) {
                if (this.adjacencyMatrix[i][j] != this.adjacencyMatrix[j][i])
                    return false;
            }
        }
        return true;
    }

    /**
     * @param i: Vertex index
     * @param j: Vertex index
     * @return: True if there's an edge that connects i and j
     */
    public boolean hasEdge(int i, int j) {
        int numVertices = this.elts.length;
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            return adjacencyMatrix[i][j];
        }
        return false;
    }
}
