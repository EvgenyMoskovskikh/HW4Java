import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> myList;

    public MyQueue() {
        this.myList = new LinkedList<>();
    }

    public void enqueue(int num) {
        this.myList.add(num);
    }

    public int dequeue() {
        int num = this.myList.getFirst();
        this.myList.remove(0);
        return num;
    }

    public int first() {
        return this.myList.getFirst();
    }

}
