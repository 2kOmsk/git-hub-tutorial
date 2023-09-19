package Collection;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Kos",5);
        Student2 st2 = new Student2("Ann",4);
        Student2 st3 = new Student2("Slav",3);
        Student2 st4 = new Student2("Eva",2);
        Student2 st5 = new Student2("Nila",1);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 st6 = new Student2("SHLOMI",2);
        Student2 st7 = new Student2("GOGI",1);
        student2LinkedList.add(st6);
        System.out.println("LinkedList " + student2LinkedList);
        student2LinkedList.add(1,st7);
        System.out.println("LinkedList " + student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println("LinkedList " + student2LinkedList);


    }
}
class Student2 {
    String name;
    int course;
    public Student2 (String name, int coure) {
        this.name = name;
        this.course = coure;
    }
    public String toString() {
        return "Student(" +
                "name='" + name + "\'" +
                ",course=" + course +
                ')';
    }
}
