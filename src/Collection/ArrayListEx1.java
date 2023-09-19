package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Kos");
        arrayList1.add("Ann");
        arrayList1.add("Slav");
        arrayList1.add(7);

        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Koss");
        arrayList2.add("BUB");
        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String>  arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
    }
}
