package Collection.map_interface;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Kos Kos");
        map1.put(3433,"Ann Ann");
        map1.put(5566,"Sla SLa");
        map1.put(2233, "Eve Eva");
        map1.put(22333, "WWW WWW");
        map1.putIfAbsent(1000, "PRO Eva");
        System.out.println(map1);
//        System.out.println(map1.get(1000));
        map1.remove(22333);
        System.out.println(map1);
        System.out.println(map1.containsValue("Eve Eva"));
        System.out.println(map1.containsKey(5566));
        System.out.println(map1.keySet());
        System.out.println(map1.values());




    }
}
