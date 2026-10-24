package homeworks;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        // Խնդիր 1 – Տպել բոլոր սիմվոլները
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("-------------");



        // Խնդիր 2 – Հաշվել սիմվոլների քանակը
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count: " + count);

        if (chars.length > 0) {
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);
        }
        System.out.println("-------------");


        // Խնդիր 3 – Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        int charCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                charCount++;
            }
        }
        System.out.println("Character '" + c + "' count: " + charCount);
        System.out.println("-------------");


        // Խնդիր 4 – Հաշվել ձայնավորների քանակը
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("-------------");


        // Խնդիր 5 – Հաշվել բաղաձայնների քանակը
        int consCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    consCount++;
                }
            }
        }
        System.out.println("Consonants count: " + consCount);
        System.out.println("-------------");


        // Խնդիր 6 – Հաշվել բացատների քանակը
        int spacesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spacesCount++;
            }
        }
        System.out.println("Spaces count: " + spacesCount);
        System.out.println("-------------");

        // Խնդիր 7 – Շրջել սիմվոլների հերթականությունը (Reverse)
        char[] task7Chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            task7Chars[i] = chars[i];
        }

        for (int i = 0; i < task7Chars.length / 2; i++) {
            char temp = task7Chars[i];
            task7Chars[i] = task7Chars[task7Chars.length - 1 - i];
            task7Chars[task7Chars.length - 1 - i] = temp;
        }
        for (int i = 0; i < task7Chars.length; i++) {
            System.out.print(task7Chars[i]);
        }
        System.out.println();
        System.out.println("-------------");


        // Խնդիր 8 – Փոխել մեծատառերը և փոքրատառերը
        char[] task8Upper = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            task8Upper[i] = chars[i];
        }
        for (int i = 0; i < task8Upper.length; i++) {
            if (task8Upper[i] >= 'a' && task8Upper[i] <= 'z') {
                task8Upper[i] = (char) (task8Upper[i] - 32);
            }
        }
        System.out.print("Uppercase: ");
        for (int i = 0; i < task8Upper.length; i++) {
            System.out.print(task8Upper[i]);
        }
        System.out.println();

        char[] task8Lower = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            task8Lower[i] = chars[i];
        }
        for (int i = 0; i < task8Lower.length; i++) {
            if (task8Lower[i] >= 'A' && task8Lower[i] <= 'Z') {
                task8Lower[i] = (char) (task8Lower[i] + 32);
            }
        }
        System.out.print("Lowercase: ");
        for (int i = 0; i < task8Lower.length; i++) {
            System.out.print(task8Lower[i]);
        }
        System.out.println();
        System.out.println("-------------");


        // Խնդիր 9 – Փոխարինել տրված սիմվոլը
        char oldChar = 'a';
        char newChar = '*';

        char[] task9Chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            task9Chars[i] = chars[i];
        }

        for (int i = 0; i < task9Chars.length; i++) {
            if (task9Chars[i] == oldChar) {
                task9Chars[i] = newChar;
            }
        }
        for (int i = 0; i < task9Chars.length; i++) {
            System.out.print(task9Chars[i]);
        }
        System.out.println();
        System.out.println("-------------");


        // Խնդիր 10 – Ստուգել Palindrome-ը
        char[] palindromeChars = {'l', 'e', 'v', 'e', 'l'};

        boolean isPalindrome = true;
        int len = palindromeChars.length;
        for (int i = 0; i < len / 2; i++) {
            if (palindromeChars[i] != palindromeChars[len - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);
        System.out.println("-------------");

        //Բոնուս խնդիրներ
        // Bonus 1 – Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] bonus1Chars = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int firstIndex = -1;

        for (int i = 0; i < bonus1Chars.length; i++) {
            if (bonus1Chars[i] == target) {
                firstIndex = i;
                break;
            }
        }
        System.out.println("First index: " + firstIndex);
        System.out.println("-------------");


        // Bonus 2 – Համեմատել երկու char զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean areEqual = true;
        if (first.length != second.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal: " + areEqual);
        System.out.println("-------------");

        // Bonus 3 – Հեռացնել կրկնվող սիմվոլները
        char[] bonus3Chars = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        System.out.print("Unique characters: ");
        for (int i = 0; i < bonus3Chars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (bonus3Chars[j] == bonus3Chars[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(bonus3Chars[i] + " ");
            }
        }
        System.out.println();

    }
}
