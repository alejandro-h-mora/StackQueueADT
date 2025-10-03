import java.util.LinkedList;

public class QueueMyLL<T> implements QueueInterface<T>{
    LinkedList<T> queueLL = new LinkedList<>();
    @Override
    public void enqueue(T item) {
        queueLL.addLast(item);
    }

    @Override
    public T dequeue() {
       T freddy =  queueLL.getFirst();
       queueLL.removeFirst();
        return freddy;
    }

    @Override
    public T front() {
        return queueLL.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queueLL.isEmpty();
    }

    @Override
    public int size() {
        return queueLL.size();
    }

    @Override
    public void clear() {
        queueLL.clear();
    }
}
