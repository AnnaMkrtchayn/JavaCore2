package homeworks;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        boolean hasError = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(i);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + ch + " but not opened at " + i);
                    hasError = true;
                    return;
                }

                int openIndex = stack.pop();
                char openChar = text.charAt(openIndex);

                if ((ch == '}' && openChar != '{') ||
                        (ch == ']' && openChar != '[') ||
                        (ch == ')' && openChar != '(')) {
                    System.out.println("Error: opened " + openChar + " but closed " + ch + " at " + i);
                    hasError = true;
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                int openIndex = stack.pop();
                System.out.println("Error: opened " + text.charAt(openIndex) + " at " + openIndex + " but never closed");
            }
            hasError = true;
        }

        if (!hasError) {
            System.out.println("Text is correct!");
        }
    }
}