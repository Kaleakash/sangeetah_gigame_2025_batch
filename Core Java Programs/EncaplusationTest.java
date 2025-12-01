class EncapsulationTest {
    public static void main(String[] args) {
       Employee emp = new Employee();
    //    emp.id=100;
    //    emp.name="Ravi";
    //    emp.salary = 12000;
    emp.setEmpInfo(100, "Raj", -12000);
       emp.displayEmpInfo();
    }
}