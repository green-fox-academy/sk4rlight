package PetrolStation;

public class StationAndCar {

    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car(30, 100);

        System.out.println("Car's gas capacity :" + car.capacity);
        System.out.println("Car's gas amount available : " + car.gasAmount);

        System.out.println("Station's gas amount available: " + station.gasAmount);
        System.out.println();
        System.out.println("Refilling...");
        System.out.println();
        station.refill(car);

        System.out.println("Car's gas amount after refill :" + car.gasAmount);

        System.out.println("Station's gas amount available after refill: " + station.gasAmount);


    }

}
