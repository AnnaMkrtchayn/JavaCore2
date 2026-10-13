package Homework;


    public class ArrayUtil {
        public static void main(String[] args) {
            int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

            // Խնդիր 1 – Տպել զանգվածի բոլոր էլեմենտները
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " " );
            }
            System.out.println();

            // Խնդիր 2 – Տպել առաջին էլեմենտը
            System.out.println("First element: " + numbers[0]);

            // Խնդիր 3 – Տպել վերջին էլեմենտը
            System.out.println("Last element: " + numbers[numbers.length - 1]);

            // Խնդիր 4 – Տպել զանգվածի երկարությունը
            System.out.println("Array length: " + numbers.length);

            // Խնդիր 5 – Գտնել ամենափոքր թիվը
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Minimum number: " + min);

            // Խնդիր 6 – Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
            if (numbers.length <= 2) {
                System.out.println("Can't print middle values");
            }

            if (numbers.length > 2) {
                if (numbers.length % 2 != 0) {
                    int midIndex = numbers.length / 2;
                    System.out.println("Middle element: " + numbers[midIndex]);
                }

                if (numbers.length % 2 == 0) {
                    int index1 = (numbers.length / 2) - 1;
                    int index2 = numbers.length / 2;
                    System.out.println("Middle elements: " + numbers[index1] + " " + numbers[index2]);
                }
            }

            // Խնդիր 7 – Հաշվել զույգ թվերի քանակը
            int evenCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenCount++;
                }
            }
            System.out.println("Even numbers count: " + evenCount);

            // Խնդիր 8 – Հաշվել կենտ թվերի քանակը
            int oddCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    oddCount++;
                }
            }
            System.out.println("Odd numbers count: " + oddCount);

            // Խնդիր 9 – Հաշվել զանգվածի էլեմենտների գումարը
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum: " + sum);

            // Խնդիր 10 – Հաշվել միջին թվաբանականը
            double average = (double) sum / numbers.length;
            System.out.println("Average: " + average);

            // Բոնուս խնդիրներ
            // Բոնուս 1 – Գտնել ամենամեծ թիվը
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Maximum number: " + max);

            // Բոնուս 2 – Հաշվել դրական, բացասական թվերը և զրոները
            int posCount = 0;
            int negCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    posCount++;
                } else if (numbers[i] < 0) {
                    negCount++;
                } else {
                    zeroCount++;
                }
            }
            System.out.println("Positive numbers count: " + posCount);
            System.out.println("Negative numbers count: " + negCount);
            System.out.println("Zeros count: " + zeroCount);

            // Բոնուս 3 – Տպել զանգվածը հակառակ հերթականությամբ
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

