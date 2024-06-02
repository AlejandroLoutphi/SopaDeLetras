/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;



/**
 *
 * @author ayahzaheraldeen
 */
public class NodeQueue<E> {
    private LinkedListNode<E> front;
    private LinkedListNode<E> end;
    private int size;

    public NodeQueue() {
        front = null;
        end = null;
        size = 0;
    }

    public void enqueue(LinkedListNode<E> node) {
        if (isEmpty()) {
            front = node;
        } else {
            end.setNext(node);
        }
        end = node;
        size++;
    }

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

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public LinkedListNode<E> getFront() {
        return front;
    }

    public void setFront(LinkedListNode<E> front) {
        this.front = front;
    }

    public LinkedListNode<E> getEnd() {
        return end;
    }

    public void setEnd(LinkedListNode<E> end) {
        this.end = end;
    }
}
