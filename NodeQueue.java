/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueclass;



/**
 *
 * @author ayahzaheraldeen
 */
public class NodeQueue {
    private Node front;
    private Node end;
    private int size;

    public NodeQueue() {
        front = null;
        end = null;
        size = 0;
    }

    public void enqueue(Node node) {
        if (isEmpty()) {
            front = node;
        } else {
            end.setNext(node);
        }
        end = node;
        size++;
    }

    public Node dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Node removedNode = front;
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
}