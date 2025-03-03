class Vehicle {     
    int numWheels;     
    String make;     
    String model;  

    Vehicle() {
        System.out.println(x:"Hello from Vehicle constructor");
    }   

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    } 

    String convertToString() {         
        return "[" + make + " -> " + model + "]"; // Added semicolon
    } 
}  

class Car extends Vehicle {     
    boolean sunRoof;     
    int numAirbags;     
    int engineCapacity;     
    int toSpeed; 
    String make;

    Car() {
         System.out.println(x:Hello from Car constructor);
    }

Car(String make, String model, int engineCapacity) {
    super(make, model);
    System.out.println(x:Hello from Car constructor 2);
//    this.make = make;
//    this.model = model;
   this.engineCapacity = engineCapacity;
}

}  

class Truck extends Vehicle { // Added "extends Vehicle"
    boolean covered;     
    int volumeCapacity;     
    int weightCapacity;     
    int currentWeight;      

    double getUtilisation() {         
        return (currentWeight * 100.0) / weightCapacity;     
    } 
}  

class Bus extends Vehicle { // Added "extends Vehicle"
    boolean ac;     
    double rating;     
    int numSeats;     
    int seatsOccupied;       

    double getUtilisation() {         
        return (seatsOccupied * 100.0) / numSeats;     
    } 
}  

// class SUV extends Car {

// }

public class Main {     
    public static void main(String[] args) {         
        Vehicle v = new Vehicle("Bajaj","Vespa");         
        v.numWheels = 4; // Fixed variable name                 
        System.out.println(v.convertToString());          

        Car umeshCar = new Car(make:"Kia", model:"Seltos",engineCapacity:1500);         
        umeshCar.engineCapacity = 1500;         
        umeshCar.numAirbags = 2;         
        umeshCar.sunRoof = true; // Fixed variable name         
        umeshCar.make = "Kia";         
        umeshCar.model = "Seltos";         
        umeshCar.numWheels = 4;          

        System.out.println(umeshCar.convertToString());     

        Bus adbdulBus = new Bus();
        adbdulBus.ac = true;
        adbdulBus.numSeats = 40;
        adbdulBus.seatsOccupied = 25;
        adbdul.make = "Volvo";
        adbdul.model = "EV4125";
        adbdulBus.topSpeed = 80; 

        System.out.println(adbdulBus.getUtilisation());
        System.out.println(adbdulBus.convertToString());
    } 
}
