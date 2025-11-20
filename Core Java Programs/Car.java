public class Car {
    int wheel;
    float price;
    String color;

    Car() {

    }
    // Car(int wheel1, float price1,String colour1){
    //     wheel=wheel1;
    //     price=price1;
    //     color=colour1;
    // }
    Car(int wheel, float price,String color){
        this.wheel=wheel;
        this.price=price;
        this.color=color;
    }
    void start() {
        System.out.println("Car Start");
    }
    void appliedGear() {
        System.out.println("Gear Applied");
    }
    void moving() {
        System.out.println("Car is moving");
    }
    void stop() {
        System.out.println("Car Stop");
    }

    void printCarDetails(String message) {
        String msg="Car Details : "+message;         // local variable 
        System.out.println(msg);
        System.out.println("wheel "+wheel);
        System.out.println("Price "+price);
        System.out.println("colour "+color);
      
    }
    
}
