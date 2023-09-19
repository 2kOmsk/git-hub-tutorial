package Collection;

import javax.naming.PartialResultException;
import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main (String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kos");
        arrayList1.add("Ann");
        arrayList1.add("Slav");
        arrayList1.add(1,"Eva");
        for (String s:arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(6);
//        for(int i =0; i < arrayList1.size();i++){
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.set(3,"EVV");
        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
