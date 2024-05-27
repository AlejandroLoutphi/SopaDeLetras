package mappingclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayahzaheraldeen
 */
public class GraphMapping {
    
    private JLabel[][] labelGrid; // 2D array to store JLabels
    private int[][] vertexIndices; // 2D array to store corresponding vertex indices

    // Constructor to initialize the mapping
    public GraphMapping(int rows, int cols) {
        labelGrid = new JLabel[rows][cols];
        vertexIndices = new int[rows][cols];
    }

    // Method to add a JLabel and its corresponding vertex index to the mapping
    public void addMapping(JLabel label, int row, int col, int vertexIndex) {
        labelGrid[row][col] = label;
        vertexIndices[row][col] = vertexIndex;
    }

    // Method to retrieve the vertex index associated with a JLabel
    public int getVertexIndex(int row, int col) {
        return vertexIndices[row][col];
    }

    // Method to check if a JLabel exists in the mapping
    public boolean containsLabel(int row, int col) {
        return labelGrid[row][col] != null;
    }

    // Method to remove a JLabel from the mapping
    public void removeLabel(int row, int col) {
        labelGrid[row][col] = null;
    }
}
    

