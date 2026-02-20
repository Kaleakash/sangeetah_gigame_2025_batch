package comparabledemo;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private float salary;

    @Override
    public int compareTo(Employee o) {
        // current salary > passing objet salary    + ve
        // current salary < passing object salary   - ve
        // current salary == passing object salary; 0
        //return 0;
       // return this.id-o.id;            // asc by id wise
        //return o.id - this.id ;         // desc by id wise
        //return (int)(this.salary - o.salary); //
        //return this.name.compareTo(o.name); // it check both name asci code // asc by nam
        return o.name.compareTo(this.name); // it check both name asci code // asc by nam
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {

    }
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
}
