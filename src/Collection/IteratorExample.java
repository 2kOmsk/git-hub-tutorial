package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kos");
        arrayList1.add("Ann");
        arrayList1.add("Slav");
        arrayList1.add("Zinger");
        arrayList1.add("FiGA");
        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
