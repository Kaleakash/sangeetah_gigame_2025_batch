interface Client1 {
    public int add(int x, int y);
}
interface Client2 {
    public int sub(int x, int y);
}

class Server implements Client1,Client2 {
    @Override
    public int add(int x, int y) {
        // TODO Auto-generated method stub
        return x+y;
    }
    @Override
    public int sub(int x, int y) {
        // TODO Auto-generated method stub
        return x-y;
    }
    public void ownMethod() {
        System.out.println("Own method");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
    Server ss  = new Server();
    System.out.println(ss.add(100, 200));
    System.out.println(ss.sub(100, 50));
    ss.ownMethod();  
    Client1 c1 = new Server();
    Client2 c2 = new Server();
    System.out.println(c1.add(1000, 2000));
    System.out.println(c2.sub(100, 50));      
    }    
}
