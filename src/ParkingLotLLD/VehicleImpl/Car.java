package ParkingLotLLD.VehicleImpl;

import ParkingLotLLD.VehicleType;

public class Car extends Vehicle {

    public Car(String licensePlate){
        super(licensePlate, VehicleType.CAR);
    }
}
