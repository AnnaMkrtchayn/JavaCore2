package homeworks;

public class BraceChecker {

    private String text;
    private int[] stck = new int[10];
    private int tos;

    public BraceChecker(String text) {
        this.text = text;
        tos = -1;
    }

    void push(int item) {
        stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            return -1;
        } else {
            return stck[tos--];
        }
    }


    public boolean check() {
        tos = -1;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                push(ch);

            } else if (ch == '}' || ch == ']' || ch == ')') {
                int last = pop();

                if (last == -1) {
                    return false;
                }

                if ((ch == '}' && last != '{') ||
                        (ch == ']' && last != '[') ||
                        (ch == ')' && last != '(')) {
                    return false;
                }
            }
        }

        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }
}
