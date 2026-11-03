package homeworks.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        // Թեստ 1 — Ավելացնել էլեմենտներ և ստուգել տպելը
        da.add(4);
        da.add(8);
        da.add(12);
        da.print();


        // Թեստ 2 — Զանգվածի մեծացում (11-րդ և ավել տարրերի ավելացում առանց սխալի)

        DynamicArray da2 = new DynamicArray();
        for (int i = 1; i <= 15; i++) {
            da2.add(i * 5);
        }
        da2.print();
        // Թեստ 3 — Կրկնակի մեծացում (25-ից ավելի տարրեր)
        DynamicArray da3 = new DynamicArray();
        for (int i = 1; i <= 27; i++) {
            da3.add(i);
        }
        da3.print();
        // Թեստ 4 — Ինդեքսով ստանալու ստուգում (getByIndex)
        DynamicArray da4 = new DynamicArray();
        da4.add(10);
        da4.add(20);
        da4.add(30);

        System.out.println(da4.getByIndex(0));
        System.out.println(da4.getByIndex(2));
        System.out.println(da4.getByIndex(5));
        System.out.println(da4.getByIndex(-1));
    }
}

