package homeworks;

public class Stack {
    private int[] stck = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2];
            System.arraycopy(stck, 0, temp, 0, stck.length);
            stck = temp;
        }
        stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            return -1;
        } else {
            return stck[tos--];
        }
    }

    public boolean isEmpty() {
        return tos < 0;
    }
}
