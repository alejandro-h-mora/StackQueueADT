import java.util.LinkedList;

public class StackMyLL<T> implements StackInterface<T>{
    LinkedList<T> myLL = new LinkedList<>();

    @Override
    public void push(T item) {
        if(myLL.isEmpty()){
            myLL =  new LinkedList<>();
        }
       myLL.addFirst(item);
    }

    @Override
    public T pop() {
        if(myLL.getFirst()==null)
            return null;
        T hi = myLL.getFirst();
        myLL.removeFirst();
        return hi;
    }

    @Override
    public T peek() {
        return myLL.getFirst();
    }

    @Override
    public boolean isEmpty() {
        if(myLL.getFirst() == null)
            return false;
        else
            return true;

    }

    @Override
    public int size() {

        return myLL.size();
    }

    @Override
    public void clear() {
        myLL.clear();
    }
}
