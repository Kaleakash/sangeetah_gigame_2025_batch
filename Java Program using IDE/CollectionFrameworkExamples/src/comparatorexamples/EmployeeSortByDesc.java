package comparatorexamples;

import java.util.Comparator;

public class EmployeeSortByDesc implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getId() - o1.getId();
    }
}
