import java.util.LinkedList;
public interface QueueInterface<T> {
    /**
     * Adds an item to the rear of the queue
     * @param item the item to be enqueued
     */
    void enqueue(T item);

    /**
     * Removes and returns the front item from the queue
     * @return the front item
     * @throws EmptyQueueException if the queue is empty
     */
    T dequeue();

    /**
     * Returns the front item without removing it
     * @return the front item
     * @throws EmptyQueueException if the queue is empty
     */
    T front();

    /**
     * Checks if the queue is empty
     * @return true if empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in the queue
     * @return the size of the queue
     */
    int size();

    /**
     * Removes all items from the queue
     */
    void clear();
}
