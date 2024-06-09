/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 * Class for storing a node of entry and a mask of all of the nodes that have
 * already been taken in a breadth first search of an adjecency matrix graph. In
 * a breadth first search, this class can be used as an entry for the queue, as
 * it stores all the required state for a particular branch of the traversal
 * tree. This class is effectively an inmutable tuple of an int and a boolean
 * array.
 *
 * @author Alejandro Loutphi
 */
class BreadthFirstSearchQueueEntry {

    private final int entry;
    private final boolean[] taken;

    /**
     * Construct an object storing the paramters as entry and taken respectively.
     * 
     * @param entry integer
     * @param taken boolean array (mask)
     */
    public BreadthFirstSearchQueueEntry(
            int entry,
            boolean[] taken) {
        this.entry = entry;
        this.taken = taken;
    }

    /**
     * Returns the attribute entry.
     * 
     * @return the attribute entry
     */
    public int getEntry() {
        return entry;
    }

    /**
     * Returns the attribute taken.
     * 
     * @return the attribute taken
     */
    public boolean[] getTaken() {
        return taken;
    }
}
