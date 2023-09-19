package Collection.map_interface;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;


public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Kos","Kos", 5);
        Student st2 = new Student("Ann","Kos", 4);
        Student st3 = new Student("Sla","Kos", 3);
        map.put(st1,7.6);
        map.put(st2,8.8);
        map.put(st3,9.9);
        System.out.println(map);

        Student st4 = new Student("Sla","Kos", 3);
        Student st5 = new Student("Eva","Kos", 1);
//        boolean result = map.containsKey(st4);
//        System.out.println("result = " + result);
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());




    }
}
class Student {
    String name;
    String surname;
    int course;

    public Student (String name,String surname,int course)  {
        this.name=name;
        this.surname=surname;
        this.course=course;


    }
    @Override
    public String toString () {
        return "Student(" +
                ",name='" + name + '\'' +
                ",surname='" + surname + '\'' +
                ",name='" + name +
                ')';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
//@Override
//public int hashCode() {
//    return name.length()*7 + surname.length()*11 + course*53;
}

