/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author Alejandro Loutphi
 */
public class BreadthFirstSearchVisReturn<E> {

    private boolean found;
    private AdjacencyMatrixGraph<E> graph;

    public BreadthFirstSearchVisReturn(boolean found, AdjacencyMatrixGraph<E> graph) {
        this.found = found;
        this.graph = graph;
    }

    public boolean getFound() {
        return found;
    }

    public AdjacencyMatrixGraph<E> getGraph() {
        return graph;
    }
}

