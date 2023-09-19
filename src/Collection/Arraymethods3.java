package Collection;

import java.util.ArrayList;

public class Arraymethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kos");
        arrayList1.add("Ann");
        arrayList1.add("Slav");
        arrayList1.add("Ann");
        System.out.println(arrayList1);
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1,arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
//        arrayList1.clear();
//        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Ann"));


    }
}
