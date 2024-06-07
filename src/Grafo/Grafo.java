/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import Estructuras.ListaArray;
import datastructures.LinkedList;
import datastructures.LinkedListNode;


import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;


/**
*
 * @author Antonella
 * @param <E> El tipo de elementos que se almacenarán en el grafo
 * Clase Grafo, representa un grafo con vertices y aristas
 */
public class Grafo<E> {
    private final ListaArray<Vertice> vertices;
    private final ListaArray<Arista> aristas;
    private double[][] distancias;
    
    private final Graph graph;
    public ViewPanel viewPanel ;
    /**
     * Constructor de la clase 
     */
    public Grafo() {
        this.vertices = new ListaArray<>(100);
        this.aristas = new ListaArray<>(100);
        this.graph = new SingleGraph("MiGrafo");

    }
    
    /**
     *Funcion para construir el grafo mediante una matriz de adyacencia 
     * @param matriz Matriz de adyancencia que representa el grafo 
     */
    public void construir(int[][] matriz, LinkedList lista) throws Exception {
        distancias = new double[matriz.length][matriz.length];
        LinkedListNode<E> pointer = lista.getHead();
        for (int i = 0; i < matriz.length; i++) {
            Vertice vertice = new Vertice(i + 1);
            AgregarVertice(vertice, lista.getStringIndex(i));
            pointer.getNext();
            System.out.println(lista.getStringIndex(i) +i);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    
                    Arista arista = new Arista(vertices.get(i), vertices.get(j));
                    AgregarArista(arista);
                    
                }
            }
        }
    }
    
    /**
     * Funcion para agregar un vertice al grafo 
     * @param vertice  vertice a agregar
     */
    public void AgregarVertice(Vertice vertice, String par){
      
            vertices.insertar(vertice);
             String idVertice = Integer.toString(vertice.valor);
            graph.addNode(idVertice);
            graph.getNode(idVertice).setAttribute("ui.label", par);
            graph.getNode(idVertice).setAttribute("ui.style", "text-alignment: under;");
    }
    
    /**
     * Metodo para agregar una arista al grafo
     * @param arista arista a agregar 
     */
    public void AgregarArista(Arista arista){
            aristas.insertar(arista);
            String idArista = arista.getOrigen().valor+ "-" + arista.getDestino().valor; // Crear un ID para la arista
        graph.addEdge(idArista, Integer.toString(arista.getOrigen().valor), Integer.toString(arista.getDestino().valor)); // Agrega la arista al grafo de GraphStream
        graph.getEdge(idArista).setAttribute("ui.label", idArista + " (" + arista.getdistancia() + ")");
}
          
    /**
     * Metodo para graficar el grafo 
     */ 
    public void mostrarGrafo() {
        // Crea un visor de Swing para el grafo //arreglar
        System.setProperty("org.graphstream.ui", "swing");
        Viewer viewer = graph.display();
        viewPanel = (ViewPanel) viewer.getDefaultView();
        viewPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        viewer.enableAutoLayout();
        
//        boton= new JButton("Cerrar");
//        boton.setBounds(300,250,100,30);
//        viewPanel.add(boton);
//        boton.setBackground(new java.awt.Color(255, 204, 204));
//        boton.setFont(new java.awt.Font("Simplex_IV50", 1, 12)); // NOI18N
//        boton.setForeground(new java.awt.Color(102, 102, 102));
//        boton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 0), null, null));
//        
    }


    
    public void resaltarCaminoMasCorto(ListaArray<Integer> caminoMasCorto) {
    for (int i = 0; i < caminoMasCorto.getSize() - 1; i++) {
        int nodoInicio = (int) caminoMasCorto.get(i+1);
        
        int nodoFin = (int) caminoMasCorto.get(i);

        // Resalta el nodo de inicio
        Node node = graph.getNode(Integer.toString(nodoInicio));
        node.setAttribute("ui.style", "fill-color: blue;");

        // Resalta la arista entre el nodo de inicio y el nodo de fin
        Edge edge = node.getEdgeBetween(Integer.toString(nodoFin));
        if (edge != null){
             edge.setAttribute("ui.style", "fill-color: red;");
        }else{
            nodoInicio=3; //Arreglar iteracion entre cada nodo proximo 
            
            
        }

    // Resalta el último nodo
    Node lastNode = graph.getNode(Integer.toString(nodoFin));
    lastNode.setAttribute("ui.style", "fill-color:green;");
    }
}
   
    public Vertice getVertice(int valor) {
        for (int i = 0; i < vertices.getSize(); i++) {
        Vertice vertice =(Vertice) vertices.get(i);
        if (vertice.valor == valor) {
            return vertice;
        }
    }
    return null;  // Si no se encuentra el vértice
        
    }

    public Arista getArista(Vertice origen, Vertice destino) {
    for (int i = 0; i < aristas.getSize(); i++) {
        Arista arista = (Arista) aristas.get(i);
        if (arista.getOrigen().equals(origen) && arista.getDestino().equals(destino)) {
            return arista;
        }
    }
    return null;  // Si no se encuentra la arista
}
     public int getNumeroVertices() {
        return vertices.getSize();
    }
   
     
     /**
      * Este método implementa el algoritmo de Dijkstra para encontrar el camino más corto entre dos nodos en un grafo
      * 
      * @param nodoInicio nodo donde empezara el camino
      * @param nododestino nodo donde terminara(comida o calle ciega)
      * @return  El camino más corto desde nodoInicio hasta nododestino como una lista de índices de nodos
      * El método funciona inicializando la distancia a todos los nodos como infinito, excepto para el nodo inicial que se establece en cero
      * Para cada nodo, selecciona el nodo no visitado con la menor distancia, calcula la distancia a través de él a cada vecino no visitado, y actualiza la distancia del vecino si es menor.
      * Marca como visitado (establece en verdadero) cuando termina con los vecinos
      * 
      */

    
}