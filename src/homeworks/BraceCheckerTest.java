package homeworks;

public class BraceCheckerTest {

    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("Hello from [Java)");
        bc.check();
        System.out.println("-------------------");

        BraceChecker bc1 = new BraceChecker("{Hello (Java)}");
        bc1.check();
        System.out.println("-------------------");

        BraceChecker bc2 = new BraceChecker("{[(])}");
        bc2.check();
    }
}