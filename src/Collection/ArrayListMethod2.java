package Collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student st1 = new Student("Kos",'m',39,5,4.9);
        Student st2 = new Student("Ann",'f',25,5,4.7);
        Student st3 = new Student("Slav",'m',19,3,5.9);
        Student st4 = new Student("Eva",'f',9,1,6.9);
        Student st5 = new Student("Nila",'f',2,0,1.9);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Nila",'f',2,0,1.9);
//        studentList.remove(st6);
        System.out.println(studentList);
        int index = studentList.indexOf(st6);
        System.out.println(index);
    }
}
       class Student {
           private String name;
           private char sex;
           private int age;
           private int course;
           private double avgGrade;

           public Student (String name, char sex, int age, int course, double avgGrade) {
               this.name = name;
               this.sex = sex;
               this.age = age;
               this.course = course;
               this.avgGrade = avgGrade;
           }
           @Override
           public String toString() {
               return "Student(" +
                       "name=" + name + '\'' +
                       ",sex=" + sex +
                       ",age=" + age +
                       ",course=" + course +
                       ", avgGrade=" + avgGrade +
                       ')';
           }

           @Override
           public boolean equals(Object o) {
               if (this == o) return true;
               if (o == null || getClass() != o.getClass()) return false;
               Student student = (Student) o;
               return sex == student.sex &&
                       age == student.age &&
                       course == student.course &&
                       Double.compare(avgGrade, student.avgGrade) == 0 &&
                       Objects.equals(name, student.name);
           }


       }
