public class StackMyArray<T> implements StackInterface<T>{
    private static int capacity;
    T[] data;
    int front = 0;
    int rear = 0;
    int size = 0;

    public StackMyArray(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
    }
    @Override
    public void push(T item) {
        if(size != capacity && front!=0){
            data[front-1] = item;
            front = front-1;
            size++;
        } else if(size!= capacity){
            data[capacity] = item;
            front = capacity;
            size++;
        }
    }

    @Override
    public T pop() {
        if(size == 0){
            throw new EmptyStackException();
        }
        T freddy = data[front];
        front = front+1;
        size--;
        return freddy;
    }

    @Override
    public T peek() {
        if(size == 0){
            throw new EmptyStackException();
        }
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        if(size == 0){
            throw new EmptyStackException();
        }
        for (int i = front; i != rear; i++) {
            data[i] = null;
            if (i == capacity) {
                i = 0;
            }
        }
    }
    }

