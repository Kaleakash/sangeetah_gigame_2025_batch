class Bike {
    public void speed() {
        System.out.println("Speed: 60km/hr");
    }
}
class Honda extends Bike {
    public void milage() {
        System.out.println("milage : 80km/lt");
    }
    @Override
    public void speed() {
        System.out.println("Speed: 50km/hr");
    }
}
class MethodOverridingExamples {
    public static void main(String[] args) {
        // Honda hh = new Honda();
        // hh.speed();
        // hh.milage();
        Bike bb = new Bike();   // super class object 
        bb.speed();
        Honda hh = new Honda(); // sub class object 
        hh.speed();         // override method 
        hh.milage();        // it own method 
        //Honda hh1 = new Bike(); // creating Super class object and sub class reference not possible 
        Bike bb1 = new Honda();     // creating sub class object and super class reference possible 
        bb1.speed();    // override method or super class method not sub class method. 
    }
}