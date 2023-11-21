import java.util.LinkedList;
import java.util.Queue;

public class CISQueue {

    private Queue<Integer> queue = new LinkedList<>();

    // Linked list property.

    // Size property.

    // Constructor.

    public CISQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    public CISQueue() {
    }

    // Enqueue. This method adds a node to the end of the linked list.

    public void enqueue(int e) {
        queue.add(e);
    }

    // Dequeue. This method removes a node from the beginning of the linked list.

    public Integer dequeue() {
        return queue.poll();
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // size. Returns the size of the queue.

    public int size() {
        return queue.size();
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}

    public String toString() {
        String s = "";
        s = s + "CISQueue{queue=" + queue;
        s = s + "], size=" + queue.size() + "}";
        return s;
    }

}
