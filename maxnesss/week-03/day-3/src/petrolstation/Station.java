package petrolstation;
/*
Station
it stores how much gas is avaliable: gasAmount
the gas amount must be given when we create a station
it can refill a car: refill(car):
decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
increases the car's gasAmount
 */

public class Station {

    public int gasAmount;
    Station(int gasAmount){
        this.gasAmount = gasAmount;
    }


    public void refill(Car car){
        this.gasAmount -= car.capacity - car.gasAmount;
        car.gasAmount += car.capacity - car.gasAmount;
    }
}
