
public class QueueMyArray<T>  implements QueueInterface<T>{
    private static final int capacity = 10;
    T[] data = (T[]) new Object[capacity];
    int front = 0;
    int rear = 0;
    int size = 0;

    @Override
    public void enqueue(T item) {
        if(size != capacity){
            data[rear] = item;
            rear = (rear+1)%capacity;
            size++;
        }

    }

    @Override
    public T dequeue() {
        if(size == 0){
            throw new EmptyQueueException("full yo");
        }
        T freddy = data[front];
        if (front == rear) {
            return null;
        }
        if (rear + 1 <= capacity) {
            front = (front + 1);
            size--;
            return freddy;

        }
        return null;
    }
    @Override
    public T front() {
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for(int i = front; i != rear; i++){
            data[i] = null;
            if(i == capacity){
                i = 0;
            }
        }
    }

}
