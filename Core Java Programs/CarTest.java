public class CarTest {
    public static void main(String[] args) {
        // Car innova = new Car();     // heap memory 
        // innova.start();
        // innova.stop();

        // Car ertiga = new Car();
        // ertiga.start();
        // ertiga.stop();

        Car innova = new Car();
        //innova.printCarDetails();
        innova.wheel=4;
        innova.color="Gray";
        innova.price=35000000;
        innova.printCarDetails("Innova");
        Car ertiga = new Car();
        //ertiga.printCarDetails();
        ertiga.color="White";
        ertiga.wheel=4;
        ertiga.price=1500000;
        ertiga.printCarDetails("Ertiga");
        Car swift = new Car(4, 1200000, "Red");
        swift.printCarDetails("Swift");
    }
}
