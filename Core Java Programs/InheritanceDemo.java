class A {
    void dis1() {
        System.out.println("A class method");
    }
}
class B extends A{
    void dis2() {
        System.out.println("B class method");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.dis1();
        b1.dis2();
        b1.dis1();
    }   
}
