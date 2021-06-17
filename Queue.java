import java.util.Arrays;

public class Queue {

    private final int[] queue;

    public Queue(int a) {
        this.queue = new int[a];
    }

    private int freeSpace() {
        for (int i = 0; i < this.queue.length; i++) {
            if (this.queue[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private int lastElement() {
        int index = this.freeSpace();
        if (index == -1) index = this.queue.length -1;
        else if (index == 0);
        else index -= 1;

        return index;
    }

    public void clear() {
        Arrays.fill(this.queue, 0);
    }

    public void add(int num) {
        int index = this.freeSpace();
        if (index != -1) this.queue[index] = num;
    }

    public int element() {
        return this.queue[0];
    }

    public int remove() {
        int head = this.element();

        for (int i = 0; i < this.queue.length-1; i++) {
            this.queue[i] = this.queue[i+1];
        }

        return head;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = this.queue.length - 1; i >= 0; i--) {
            str.append(this.queue[i]);
            if (i != 0) str.append("\n");
        }
        return str.toString();
    }
    
}
