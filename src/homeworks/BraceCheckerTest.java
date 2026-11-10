package homeworks;

public class BraceCheckerTest {

    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("Hello from [Java]");
        System.out.println(bc.check());

        BraceChecker bc1 = new BraceChecker("{Hello (Java)}");
        System.out.println(bc1.check());

        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        System.out.println(bc2.check());

        BraceChecker bc3 = new BraceChecker("{[()]}");
        System.out.println(bc3.check());

        BraceChecker bc4 = new BraceChecker("Hello Java");
        System.out.println(bc4.check());

        BraceChecker bc5 = new BraceChecker("{[(])}");
        System.out.println(bc5.check());

        BraceChecker bc6 = new BraceChecker("Hello from Java]");
        System.out.println(bc6.check());

        BraceChecker bc7 = new BraceChecker("{Hello Java");
        System.out.println(bc7.check());

        BraceChecker bc8 = new BraceChecker("((()))");
        System.out.println(bc8.check());

        BraceChecker bc9 = new BraceChecker("(()");
        System.out.println(bc9.check());
    }
}