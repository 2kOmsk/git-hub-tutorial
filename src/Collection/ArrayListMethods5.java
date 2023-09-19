package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kos");
        arrayList1.add("Ann");
        arrayList1.add("Slav");
        arrayList1.add("Zinger");
        arrayList1.add("FiGA");
//
//        List<Integer> list1 = List.of(3,8,12);
//        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        System.out.println("ArrayList = " + arrayList1);
//        Object[] array = arrayList1.toArray();
//        String [] array2 = arrayList1.toArray(new String[0]);
//        for(String s:array2) {
//            System.out.println(s);
        }
//        List<String> myList = arrayList1.subList(1,4);
//        System.out.println("subList = " + myList);
//        myList.add("RUSTTT");
//        System.out.println("subList = " + myList);
//        System.out.println("ArrayList = " + arrayList1);
//        arrayList1.add("POPA");
//        System.out.println("ArrayList = " + arrayList1);
//        System.out.println("subList = " + myList);
////
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Kos");
//        arrayList2.add("Ann");
////        arrayList2.add("Feofan");
////        arrayList1.retainAll(arrayList2);
////        System.out.println(arrayList1);
//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result);
    }

