/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 * Stack of int's.
 * Has an inmutable max capacity.
 * Intenally stored as an int[].
 * @author Alejandro Loutphi
 */
public class IntStack {

    private final int capacity;
    private int top;
    private int[] stack;

    /** 
     * Constructs an empty stack with the specified capacity.
     * @param capacity max capacity of constructed stack
     */
    public IntStack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.stack = new int[this.capacity];
    }

    /** 
     * Constructs an empty stack with a capacity of 16.
     */
    public IntStack() {
        this(16);
    }

    /**
     * Returns max capacity of this stack.
     * @return max capacity of this stack
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns index of the next element to be pushed to the stack.
     * @return index of the next element to be pushed to the stack
     */
    public int getTopIndex() {
        return top;
    }

    /**
     * Sets the top of the stack to the specified array index.
     * @param top array index to set as the top of the stack
     * @throws IndexOutOfBoundsException if the new top of the stack is greater than its capacity
     */
    public void setTop(int top) throws IndexOutOfBoundsException {
        if (top >= capacity)
            throw new IndexOutOfBoundsException();
        this.top = top;
    }

    /**
     * Returns an array containing the entire stack.
     * @return an array containing the entire stack
     */
    public int[] getStack() {
        return stack;
    }

    /**
     * Empties the entire stack.
     */
    public void empty() {
        this.stack = new int[this.capacity];
        this.top = 0;
    }

    /**
     * Pushes an int element to the top of the stack.
     * @param elt int to push
     * @return false if the element could not be pushed. Otherwise, true
     */
    public boolean push(int elt) {
        if (this.top == this.capacity)
            return false;

        this.stack[top] = elt;
        top++;
        return true;
    }

    /**
     * Returns and deletes the element at the top of the stack.
     * Sets the former second-to-top element as the new top.
     * @return element at the top of the stack
     * @throws IndexOutOfBoundsException if the stack is empty (there are no elements to pop)
     */
    public int pop() throws IndexOutOfBoundsException {
        if (this.top == 0)
            throw new IndexOutOfBoundsException();
        top--;
        return this.stack[top];
    }
}
