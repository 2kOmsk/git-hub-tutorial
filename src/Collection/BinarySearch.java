package Collection;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(77);
        arrayList.add(157);
        arrayList.add(90);
        arrayList.add(-40);
        arrayList.add(-13);
        arrayList.add(87);
        arrayList.add(777);
        arrayList.add(15);
        arrayList.add(91);
        arrayList.add(-20);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        int index1 = Collections.binarySearch(arrayList,-3 );
        System.out.println(index1);

//
//        Employee emp1 = new Employee(100,"FeDOR",12333);
//        Employee emp2 = new Employee(50,"FEOFAN",33322);
//        Employee emp3 = new Employee(67,"ANNA",66554);
//        Employee emp4 = new Employee(78,"PETR", 1003983);
//        Employee emp5 = new Employee(110,"KOS",123333);
//        Employee emp6 = new Employee(67,"SOPTR",133322);
//        Employee emp7 = new Employee(87,"JVECHKO",1665454);
//        Employee emp8 = new Employee(998,"PISTEC", 500983);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        employeeList.add(emp8);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index2 = Collections.binarySearch(employeeList, new Employee(67,"ANNA",66554));
//        System.out.println(index2);
//        int[] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);


    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int  salary;

    public Employee (int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
       return "Employee { " +
               "id=" + id +
               ",name=" + name +
               ",salary=" + salary +
               '}';
    }


    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result==0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
