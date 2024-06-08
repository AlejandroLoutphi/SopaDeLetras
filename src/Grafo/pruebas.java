/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import datastructures.LinkedList;

/**
 *
 * @author luciano
 */
public class pruebas {
   public static void main(String[] args) throws Exception{
       int[][] matriz = { 
           {0,1,0},
           {0,0,0},
           {1,1,0}
       };
       
       LinkedList lista = new LinkedList<String>();
       
       lista.setHead("D");

       lista.add("C");
       lista.add("f");
       lista.add("E");
       
    Grafo grafo=new Grafo();
                      
                      grafo.construir(matriz, lista);
                      grafo.mostrarGrafo();
                      
                      System.out.println(lista.get(1)+"prueba");
   }
}
