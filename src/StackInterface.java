public interface StackInterface<T> {
    /**
     * Adds an item to the top of the stack
     * @param item the item to be pushed
     */
    void push(T item);

    /**
     * Removes and returns the top item from the stack
     * @return the top item
     * @throws EmptyStackException if the stack is empty
     */
    T pop();

    /**
     * Returns the top item without removing it
     * @return the top item
     * @throws EmptyStackException if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty
     * @return true if empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in the stack
     * @return the size of the stack
     */
    int size();

    /**
     * Removes all items from the stack
     */
    void clear();
}