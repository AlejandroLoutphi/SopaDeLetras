/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 * Queue data structure implemented using LinkedListNode's.
 *
 * @author ayahzaheraldeen
 */
public class NodeQueue<E> {
    private LinkedListNode<E> front;
    private LinkedListNode<E> end;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public NodeQueue() {
        front = null;
        end = null;
        size = 0;
    }

    /**
     * Adds the passed-in LinkedListNode to the end of the queue. Does not add any
     * elements pointed to by node to the queue.
     * 
     * @param node LinkedListNode storing the element to enqueue
     */
    public void enqueue(LinkedListNode<E> node) {
        if (isEmpty()) {
            front = node;
        } else {
            end.setNext(node);
        }
        end = node;
        size++;
    }

    /**
     * Adds the passed-in element to the end of the queue.
     * 
     * @param elt element to enqueue
     */
    public void enqueue(E elt) {
        this.enqueue(new LinkedListNode<>(elt, null));
    }

    /**
     * Removes the first element in queue and returns the LinkedListNode containing it.
     *
     * @return first LinkedListNode in the queue
     */
    public LinkedListNode<E> dequeue() {
        if (isEmpty()) {
            return null;
        }
        LinkedListNode<E> removedNode = front;
        front = front.getNext();
        if (front == null) {
            end = null;
        }
        size--;
        return removedNode;
    }

    /**
     * Returns true if there are no elements in the queue. Otherwise, false.
     * @return true if there are no elements in the queue. Otherwise, false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the amount of elements in the queue.
     * @return amount of elements in the queue
     */
    public int size() {
        return size;
    }

    /**
     * Returns the LinkedListNode containing the first element in queue.
     *
     * @return first LinkedListNode in queue
     */
    public LinkedListNode<E> getFront() {
        return front;
    }

    /**
     * Returns the LinkedListNode containing the last element in queue.
     *
     * @return last LinkedListNode in queue
     */
    public LinkedListNode<E> getEnd() {
        return end;
    }
}
