/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopadeletras;

/**
 *
 * @author Alejandro Loutphi
 */
public class IntStack {

    private final int capacity;
    private int top;
    private int[] stack;

    public IntStack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.stack = new int[this.capacity];
    }

    public IntStack() {
        this(16);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) throws IndexOutOfBoundsException {
        if (top >= capacity)
            throw new IndexOutOfBoundsException();
        this.top = top;
    }

    public int[] getStack() {
        return stack;
    }

    public boolean push(int elt) {
        if (this.top == this.capacity)
            return false;

        this.stack[top] = elt;
        top++;
        return true;
    }
    
    public int pop() throws IndexOutOfBoundsException {
        if (this.top == this.capacity)
            throw new IndexOutOfBoundsException();
        int elt = this.stack[top];
        top--;
        return elt;
    }
}
