package comparabledemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableExample {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(2);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "Alex", 25000.50f));
        employees.add(new Employee(1, "Raj", 25000.75f));
        employees.add(new Employee(3, "Mahesh", 28000));
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }

}
