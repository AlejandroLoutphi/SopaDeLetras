/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author Alejandro Loutphi
 */
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

