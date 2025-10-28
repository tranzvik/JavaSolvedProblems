package ParkingLotLLD.VehicleImpl;

import ParkingLotLLD.VehicleType;

public abstract class Vehicle {

    protected String licensePlate;
    protected VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }



}
