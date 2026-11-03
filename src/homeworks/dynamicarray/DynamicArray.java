package homeworks.dynamicarray;

public class DynamicArray {

        // Մեր հիմնական զանգվածն է, որտեղ պահելու ենք ավելացվող էլեմենտները[cite: 3]
        private int[] array = new int[10];

        // Մեր զանգվածում ավելացված էլեմենտների քանակն է
        private int size = 0;

        //Խնդիր 1 Ավելացնել նոր էլեմենտ
        public void add(int value) {
            // 1. Ստուգել՝ արդյոք զանգվածում ազատ տեղ կա
            // 2. Եթե տեղ չկա, կանչել extend() մեթոդը
            if (size == array.length) {
                extend();
            }
            // 3. Ավելացնել նոր էլեմենտը
            array[size] = value;
            // 4. Մեծացնել size-ի արժեքը
            size++;
        }


        //Խնդիր 2 Մեծացնել զանգվածի տարողությունը
        private void extend() {
            // 1. Ստեղծել հին զանգվածից 10 էլեմենտով ավելի մեծ նոր զանգված
            int[] newArray = new int[array.length + 10];
            // 2. Հին զանգվածի բոլոր էլեմենտները պատճենել նոր զանգվածի մեջ
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            // 3. array փոփոխականը կապել նոր զանգվածի հետ
            array = newArray;
        }

        //Խնդիր 3 Վերադարձնել տրված ինդեքսի էլեմենտը
        public int getByIndex(int index) {
            // Եթե index-ը 0-ից մինչև size - 1 միջակայքում է, վերադարձնել էլեմենտը, հակառակ դեպքում՝ -1
            if (index >= 0 && index < size) {
                return array[index];
            }
            return -1;
        }

        //Խնդիր 4 Տպել զանգվածում ավելացված բոլոր էլեմենտները (միայն size քանակով)
        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

