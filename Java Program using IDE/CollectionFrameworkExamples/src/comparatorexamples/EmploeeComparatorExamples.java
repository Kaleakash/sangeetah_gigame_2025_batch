package comparatorexamples;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploeeComparatorExamples {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "Alex", 25000.50f));
        employees.add(new Employee(1, "Raj", 25000.75f));
        employees.add(new Employee(3, "Mahesh", 28000));
        System.out.println(employees);

        //Collections.sort(employees,new EmployeeSortbyIdAsc());

        Collections.sort(employees,new EmployeeSortByDesc());

        System.out.println(employees);
    }
}
