import java.util.Arrays;

public class Stack {

    private final int[] stack;

    public Stack(int a) {
        this.stack = new int[a];
    }

    private int freeSpace() {
        for (int i = 0; i < this.stack.length; i++) {
            if (this.stack[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private int lastElement() {
        int index = this.freeSpace();
        if (index == -1) index = this.stack.length -1;
        else if (index == 0);
        else index -= 1;

        return index;
    }

    public boolean empty() {
        boolean empty = true;
        for (int num: this.stack) {
            if (num != 0) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    public void clear() {
        Arrays.fill(this.stack, 0);
    }

    public void push(int num) {
        if (this.empty()) this.stack[0] = num;
        else {
            int index = this.freeSpace();
            if (index != -1) this.stack[index] = num;
        }
    }

    public int peek() {
        int index = this.lastElement();

        return this.stack[index];
    }

    public int pop() {
        int index = this.lastElement();
        int num = this.stack[index];

        this.stack[index] = 0;
        return num;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = this.stack.length - 1; i >= 0; i--) {
            str.append(this.stack[i]);
            if (i != 0) str.append("\n");
        }
        return str.toString();
    }

}
