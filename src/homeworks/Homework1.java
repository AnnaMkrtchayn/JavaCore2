package homeworks;

public class Homework1 {

        public static void main(String[] args) {

            int x = 12;
            int y = 25;

            if (x > y) {
                System.out.println("x-ը մեծ է y-ից");
            } else if (y > x) {
                System.out.println("x-ը փոքր  է y-ից");
            } else {
                System.out.println("x-ը համասար է y-ին");
            }

            System.out.println("————————");

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("————————");

            int a = 5;
            int b = 7;
            System.out.println(a + b);

            System.out.println("————————");

            int n = 3;
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }

