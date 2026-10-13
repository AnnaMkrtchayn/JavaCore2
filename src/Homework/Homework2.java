package Homework;

public class Homework2 {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("_______");

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("________");

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int d = 1; d <= i; d++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            System.out.println("________");

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int d = 1; d <= n - i + 1; d++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            System.out.println("________");

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int d = 1; d <= i; d++) {
                            System.out.print("* ");
                        }
                        for (int e = 2; e <= i; e++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    for (int i = n - 1; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int d = 1; d <= i; d++) {
                            System.out.print("* ");
                        }
                        for (int e = 2; e <= i; e++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
        }
}
