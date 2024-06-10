/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 * Class for storing whether a certain array of elements has been found in a
 * graph and the graph representing the traversal tree a BFS algorithm would
 * take to find it. This class is effectively an inmutable tuple of a boolean
 * and an AdjacencyMatrixGraph.
 *
 * @author Alejandro Loutphi
 */
public class BreadthFirstSearchVisReturn<E> {

    private final boolean found;
    private final AdjacencyMatrixGraph<E> graph;

    /**
     * Constructs an object with the passed parameters.
     * 
     * @param found a boolean
     * @param graph an AdjacencyMatrixGraph
     */
    public BreadthFirstSearchVisReturn(boolean found, AdjacencyMatrixGraph<E> graph) {
        this.found = found;
        this.graph = graph;
    }

    /**
     * Returns the attribute found.
     * 
     * @return the attribute found
     */
    public boolean getFound() {
        return found;
    }

    /**
     * Returns the attribute graph.
     * 
     * @return the attribute graph
     */
    public AdjacencyMatrixGraph<E> getGraph() {
        return graph;
    }
}
