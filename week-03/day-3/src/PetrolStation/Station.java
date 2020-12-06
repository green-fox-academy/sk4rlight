package PetrolStation;

public class Station {
    int gasAmount = 5000;

    public void refill(Car car){
        this.gasAmount = gasAmount - (car.capacity - car.gasAmount);
        car.gasAmount = car.gasAmount + (car.capacity - car.gasAmount);
    }
}
