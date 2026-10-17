package homeworks;

public class ArrayHomework {

    public static void main(String[] args) {

        // Խնդիր 1 – Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers1 = {6, 3, 4, 6, 1, 9, 4, 4, 2, 4};
        int n = 4;
        int count1 = 0;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == n) {
                count1++;
            }
        }
        System.out.println("Count of " + n + ": " + count1);

        System.out.println("-----------");


        // Խնդիր 2 – Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};

        for (int i = 0; i < numbers2.length / 2; i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        System.out.println("-----------");


        // Խնդիր 3 – Հաշվել կրկնվող թվերի քանակը
        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedCount = 0;

        for (int i = 0; i < numbers3.length; i++) {
            int currentNum = numbers3[i];
            int foundEarlier = 0;
            for (int d = 0; d < i; d++) {
                if (numbers3[d] == currentNum) {
                    foundEarlier = 1;
                    break;
                }
            }
            if (foundEarlier == 0) {
                int totalOccurrences = 0;

                for (int k = 0; k < numbers3.length; k++) {
                    if (numbers3[k] == currentNum) {
                        totalOccurrences++;
                    }
                }
                if (totalOccurrences > 1) {
                    repeatedCount++;
                }
            }
        }

        System.out.println("Repeated numbers count: " + repeatedCount);

        System.out.println("-----------");


        // Խնդիր 4 – Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'ա' || c == 'ե' || c == 'է' || c == 'ը' || c == 'ի' || c == 'ո' || c == 'օ') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("-----------");

        // Բոնուս խնդիրներ
        // Բոնուս 1 – Գտնել երկրորդ ամենամեծ թիվը
        int[] bonus1 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int max = bonus1[0];
        for (int i = 0; i < bonus1.length; i++) {
            if (bonus1[i] > max) {
                max = bonus1[i];
            }
        }
        int secondMax = bonus1[0];
        for (int i = 0; i < bonus1.length; i++) {
            if (bonus1[i] < max) {
                secondMax = bonus1[i];
                break;
            }
        }
        for (int i = 0; i < bonus1.length; i++) {
            if (bonus1[i] < max && bonus1[i] > secondMax) {
                secondMax = bonus1[i];
            }
        }
        System.out.println("Second maximum: " + secondMax);
        System.out.println("-----------");

        // Բոնուս 2 – Հեռացնել կրկնվող թվերը
        int[] bonus2 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < bonus2.length; i++) {
            boolean isFirst = true;
            for (int d = 0; d < i; d++) {
                if (bonus2[i] == bonus2[d]) {
                    isFirst = false;
                    break;
                }
            }

            if (isFirst) {
                System.out.print(bonus2[i] + " ");
            }
        }
        System.out.println();
        System.out.println("-----------");


        // Բոնուս 3 – Գտնել ամենաշատ կրկնվող թիվը
        int[] bonus3 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int mostFrequent = bonus3[0];
        int maxCount = 0;

        for (int i = 0; i < bonus3.length; i++) {
            int currentCount = 0;
            for (int j = 0; j < bonus3.length; j++) {
                if (bonus3[i] == bonus3[j]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = bonus3[i];
            }
        }
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Count: " + maxCount);

    }
}